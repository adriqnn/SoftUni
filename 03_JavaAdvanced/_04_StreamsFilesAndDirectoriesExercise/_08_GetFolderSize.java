package _03_JavaAdvanced._04_StreamsFilesAndDirectoriesExercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _08_GetFolderSize {
    public static void main(String[] args) {
        
        // Path
        String path = "...";
        
        // Folders
        File folder = new File(path);
        File[] filesInFolder = folder.listFiles();
        
        int folderSize = 0;
        
        // Get folder size
        for (File e : filesInFolder) {
            folderSize += e.length();
        }
        
        // Print result
        System.out.println("Folder size: " + folderSize);
    }
}
