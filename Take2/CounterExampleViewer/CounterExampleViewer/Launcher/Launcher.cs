using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Diagnostics;

namespace Launcher
{
    class Launcher
    {
        static void Main(string[] args)
        {
            string filePath = @"C:\Users\Ofir\Documents\tau\winter-14\project\Modelling2014\Take2\CounterExampleViewer\tset.txt";
            File.AppendAllText(filePath, "Ran3" + "\n");
            Console.WriteLine("Ran");
            try
            {
                string baseDir = AppDomain.CurrentDomain.BaseDirectory;
                Process.Start( Path.Combine( baseDir, "Viewer.exe" ) );
            }
            catch (Exception ex)
            {
                File.AppendAllText(filePath, ex.Message + "\n");
                File.AppendAllText(filePath, ex.StackTrace + "\n");
            }
            File.AppendAllText(filePath, "Started viewer" + "\n");

            Console.WriteLine("Started viewr");
        }
    }
}
