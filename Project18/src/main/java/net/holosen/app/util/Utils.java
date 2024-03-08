package net.holosen.app.util;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Utils {
    public void appendFile(String fileName, String input) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        //fw.append("\n");
        fw.append(input);
        fw.close();
    }

    public List<String> readerFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        return Files.readAllLines(path);
    }
}
