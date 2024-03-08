package util;

import java.io.*;

public class FileUtil {
    public void fileWriter(String fileName, String str)
            throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(str);

        writer.close();
    }

    public void appendFile(String fileName, String input) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        fw.append("\n");
        fw.append(input);
        fw.close();
    }

    public void readerFile(String fileName, String line) throws IOException {
        FileReader fr = new FileReader(fileName);

        BufferedReader br = new BufferedReader(fr);

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
