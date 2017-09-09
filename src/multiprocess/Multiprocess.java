package multiprocess;

import java.io.PrintWriter;

public class Multiprocess {
    public static void main(String arg[])
    {
        try
        {
            PrintWriter writer = new PrintWriter("/Users/mihai/Desktop/Special/myfile.txt", "UTF-8");
            PrintWriter writer1 = new PrintWriter("/Users/mihai/Desktop/Special/myfile1.txt", "UTF-8");
            PrintWriter writer2 = new PrintWriter("/Users/mihai/Desktop/Special/myfile2.txt", "UTF-8");
            writer.println("The first line");
            writer1.println("The second line");
            writer2.println(("The third line"));
            writer.close();
            writer1.close();
            writer2.close();

            ProcessBuilder procone = new ProcessBuilder("open", "/Users/mihai/Desktop/Special/myfile.txt" );
            procone.start();
            ProcessBuilder proctwo = new ProcessBuilder("open", "/Users/mihai/Desktop/Special/myfile1.txt");
            proctwo.start();
            ProcessBuilder procthree = new ProcessBuilder("open", "/Users/mihai/Desktop/Special/myfile2.txt");
            procthree.start();

        } catch (Exception e) {
            System.out.println("Error Executing notepad.");
        }
    }
}