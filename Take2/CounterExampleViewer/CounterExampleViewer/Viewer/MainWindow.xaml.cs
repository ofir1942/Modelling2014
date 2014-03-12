using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;

using System.Threading;
using System.IO;
using System.Diagnostics;

namespace Viewer
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private static Mutex mutex                       = new Mutex(true, "{8F6F0AC4-B9A1-45fd-A8CF-72F04E6BDE8F}");
        private static string LAST_WORKING_DIR_FILE_PATH = "last_working_dir.txt";
        
        private string              workingDir;
        private FileSystemWatcher   watcher         = null;
        private bool                updateRequired  = false;
        private Timer               updateTimer     = null;
        private DateTime            lastUpdate      = DateTime.MinValue;
        private string              currentSMVFile  = null;
        public MainWindow()
        {
            if (!mutex.WaitOne(TimeSpan.Zero, true))
            {
                //MessageBox.Show("only one instance at a time");
                Application.Current.Shutdown();
                return;
            }
            
            InitializeComponent();
            LoadLastWorkingDir();
            UpdateFileWatcher();
            SetupUpdateTimer();
        }

        private void SetupUpdateTimer()
        {
            int timeout = 100;
            updateTimer = new Timer(timerCallback);
            updateTimer.Change( 0, timeout);
        }

        // This method is called by the timer delegate.
        public void timerCallback(Object stateInfo)
        {
            TimeSpan MIN_UPDATE_DELAY = new TimeSpan(0,0,0,0,500);
            if (updateRequired)
            {
                updateRequired = false;
                if ((DateTime.Now - lastUpdate) < MIN_UPDATE_DELAY )
                    return;

                this.Dispatcher.BeginInvoke((Action)(() =>
                {
                    txtBoxLog.Text = txtBoxLog.Text + "Update Required on "  + currentSMVFile + "\n";
                }
                ));

                PerformUpdate();
                
                lastUpdate      = DateTime.Now;
            }
        }

        private void PerformUpdate()
        {
            const string NuSMV_Path = @"C:\Program Files\NuSMV\2.5.4\bin\NuSMV.exe";
            Process p = new Process();
            // Redirect the output stream of the child process.
            p.StartInfo.UseShellExecute         = false;
            p.StartInfo.RedirectStandardOutput  = true;
            p.StartInfo.FileName                = NuSMV_Path;
            p.StartInfo.Arguments               = currentSMVFile;
            p.Start();
            p.WaitForExit();
            
            try
            {
                string output = p.StandardOutput.ReadToEnd();
                this.Dispatcher.BeginInvoke((Action)(() =>
                {
                    txtBoxNuSMV.Text = output;
                }
           ));
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

           
        }

        private void UpdateFileWatcher()
        {
            if (watcher != null)
                watcher.EnableRaisingEvents = false;
            else
                watcher = new FileSystemWatcher();

            watcher.Path = workingDir;
            /* Watch for changes in LastAccess and LastWrite times, and
               the renaming of files or directories. */
            watcher.NotifyFilter = //NotifyFilters.LastAccess | 
                                   NotifyFilters.LastWrite;
                                   //NotifyFilters.FileName | NotifyFilters.DirectoryName;
            // Only watch text files.
            watcher.Filter = "*.smv";

            // Add event handlers.
            watcher.Changed += new FileSystemEventHandler(OnChanged);
            //watcher.Created += new FileSystemEventHandler(OnChanged);
            //watcher.Deleted += new FileSystemEventHandler(OnChanged);
            //watcher.Renamed += new RenamedEventHandler(OnRenamed);

            // Begin watching.
            watcher.EnableRaisingEvents = true;
        }

        // Define the event handlers. 
        private void OnChanged(object source, FileSystemEventArgs e)
        {
            // Specify what is done when a file is changed, created, or deleted.
            Console.WriteLine("File: " + e.FullPath + " " + e.ChangeType);
            currentSMVFile = e.FullPath;
            updateRequired = true;
            this.Dispatcher.BeginInvoke((Action)(() =>
            {
                txtBoxLog.Text = txtBoxLog.Text + "File: " + e.FullPath + " " + e.ChangeType + "\n";
            }
            ));
        }

        private void LoadLastWorkingDir()
        {
            if (File.Exists(LAST_WORKING_DIR_FILE_PATH))
                workingDir = File.ReadAllText(LAST_WORKING_DIR_FILE_PATH);
            else
                workingDir = ".";

            txtBoxSrcGenDir.Text = Path.GetFullPath( workingDir );
        }

        private void SaveLastWorkingDir()
        {
            File.WriteAllText(LAST_WORKING_DIR_FILE_PATH, workingDir);
        }

        private void Window_Closed(object sender, EventArgs e)
        {
            mutex.ReleaseMutex();
        }

        private void btnBrowse_Click(object sender, RoutedEventArgs e)
        {
            var dialog           = new System.Windows.Forms.FolderBrowserDialog();
            dialog.SelectedPath  = workingDir;
            var result           = dialog.ShowDialog();
            workingDir           = dialog.SelectedPath;
            txtBoxSrcGenDir.Text = workingDir;
            SaveLastWorkingDir();
            UpdateFileWatcher();
        }

    }
}
