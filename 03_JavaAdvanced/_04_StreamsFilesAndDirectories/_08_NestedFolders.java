package _03_JavaAdvanced._04_StreamsFilesAndDirectories;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Scanner;

public class _08_NestedFolders {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String path = "...";
        File root = new File(path);
        ArrayDeque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);
        int count = 0;
        while(!dirs.isEmpty()){
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for(File e : nestedFiles){
                if (e.isDirectory()){
                    dirs.offer(e);
                }
            }
            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");
        scan.close();
    }
}
