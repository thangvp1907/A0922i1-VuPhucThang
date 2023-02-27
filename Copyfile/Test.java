package Copyfile;

public class Test {
    public static void main(String[] args) {
        Copyfile copyfile = new Copyfile();
        String path = "C:\\Users\\Admin\\Desktop\\New Text Document.txt";
        String path2 ="C:\\Users\\Admin\\Desktop\\New Text Document (2).txt";
        copyfile.copy(path,path2);
    }
}
