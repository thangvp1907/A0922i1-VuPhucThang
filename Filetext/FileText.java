package Filetext;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileText {
    public static void writeFile(String path, List<String> list) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (String str : list) {
                writer.write(str);
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String path) {
        List<String> list = new ArrayList();
        try (BufferedReader readfile = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = readfile.readLine()) != null) {
                list.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
