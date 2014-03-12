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

namespace Viewer
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private static Mutex mutex                       = new Mutex(true, "{8F6F0AC4-B9A1-45fd-A8CF-72F04E6BDE8F}");
        private static string LAST_WORKING_DIR_FILE_PATH = "last_working_dir.txt";
        
        private string            workingDir;
        private FileSystemWatcher watcher = null;

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
