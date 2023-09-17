package _03_JavaAdvanced._04_StreamsFilesAndDirectories;

import java.io.File;
import java.util.Scanner;

public class _07_ListFiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // File path
        File file = new File("...");
        
        // List all files in the directory
        if(file.exists()){
            if(file.isDirectory()){
                File[] files = file.listFiles();
                
                for (File f : files) {
                    if(!f.isDirectory()){
                        System.out.printf("%s: [%s]%n", f.getName(), f.length());
                    }
                }
            }
        }
        
        scan.close();
    }
}


/*public class ListFiles_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        File file = new File("");
        
        if(file.exists()){
            if(file.isDirectory()){
                File[] files = file.listFiles();
                
                for (File f : files) {
                    if(!f.isDirectory()){
                        System.out.printf("%s: [%s]%n", f.getName(), f.length());
                    }
                }
            }
        }
        
        scan.close();
    }
}
*/
