package ProductFile;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class readBinary2 {
    public void writeObject (String path,List<Product> list){
        try(ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))) {
            stream.writeObject(list);
            stream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Product> readOject(String path){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
    public void search(String path,String name){
        List<Product> productList = readOject(path);
        for(Product p : productList){
            if(p.getName().equals(name)){
                System.out.println(p.toString());
            }
        }
    }
}
