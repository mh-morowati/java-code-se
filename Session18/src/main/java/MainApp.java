import util.FileUtil;

import java.io.*;

public class MainApp {
    public static String fileName = "java.txt";

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            FileUtil fileUtil = new FileUtil();
            //fileUtil.fileWriter(fileName, input);
          // fileUtil.appendFile(fileName,input);
           fileUtil.readerFile(fileName, input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
