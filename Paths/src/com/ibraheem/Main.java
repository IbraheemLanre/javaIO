package com.ibraheem;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try{
           /* Path fileToDelete = FileSystems.getDefault().getPath("Example", "Dir1","file1copy.txt");
            Files.deleteIfExists(fileToDelete);*/
           /*Path fileToCreate = FileSystems.getDefault().getPath("Example", "file1.txt");
           Files.createFile(fileToCreate);*/
           /*Path dirToCreate = FileSystems.getDefault().getPath("Example", "Dir4");
           Files.createDirectory(dirToCreate);*/

/*
            Path dirToCreate = FileSystems.getDefault().getPath("Example", "Dir2/Dir3/Dir4/Dir5/Dir6");
            Files.createDirectories(dirToCreate);
*/
            Path filePath = FileSystems.getDefault().getPath("Example", "Dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last modified = " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("Is directory = " + attrs.isDirectory());
            System.out.println("Is regaular file = " + attrs.isRegularFile());

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        /*Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        //Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
        Path filePath = Paths.get(".","files","SubdirectoryFile.txt");
        printFile(filePath);
        filePath = Paths.get("C:/Users/s2001108/IdeaProjects/JavaIO/OutThere.txt.txt/");
        //filePath = Paths.get("C:\\", "Users", "s2001108", "IdeaProjects", "JavaIO", "OutThere.txt.txt");
        printFile(filePath);

        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());

        Path path2 = FileSystems.getDefault().getPath(".","files", "..", "files","SubdirectoryFile.txt");
        System.out.println(path2.normalize().toAbsolutePath());
        printFile(path2.normalize());

        Path path3 = FileSystems.getDefault().getPath("thisfilenoexist.txt");
        System.out.println(path3.toAbsolutePath());
        System.out.println("Exists = " + Files.exists(path3));

        //filePath = FileSystems.getDefault().getPath("files");
        filePath = Paths.get(".", "files", "SubdirectoryFile.txt");
        System.out.println("Exists = " + Files.exists(filePath));*/
    }

    /*private static void printFile(Path path){
        try(BufferedReader fileReader = Files.newBufferedReader(path)){
            String line;
            while((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }*/
}
