package Copyfile;

import java.io.*;

public class Copyfile {
    public void copy(String path, String path2) {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(path);
            os = new FileOutputStream(path2);
            byte[] bytes = new byte[1024];
            int lenght;
            while (( lenght = is.read(bytes)) >0){
                os.write(bytes,0,lenght);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
