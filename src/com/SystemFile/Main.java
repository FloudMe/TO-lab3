package com.SystemFile;

public class Main {

    public static void main(String[] args) {

        try {

            ProxyFolder f1 = new ProxyFolder("Folder1");
            ProxyFolder f2 = new ProxyFolder("Folder2");
            ProxyFolder f3 = new ProxyFolder("Folder3");

            File file1 = new File("File1" ,"Data of file 1");
            File file2 = new File("File2" ,"Data of file 2");
            File file3 = new File("File3" ,"Data of file 3");
            File file4 = new File("File4" ,"Data of file 4");
            File file5 = new File("File5" ,"Data of file 5");

            f1.addFileComponent(file1);
            f1.addFileComponent(file2);
            f1.addFileComponent(f2);
            f2.addFileComponent(file3);
            f2.addFileComponent(f3);
            f3.addFileComponent(file4);
            f3.addFileComponent(file5);


            System.out.println("tree:");
            f1.tree(" ");
            System.out.println("======================================");
            System.out.println("ls:");
            f1.ls();
            System.out.println("======================================");
            System.out.println("more:");
            file1.more();
        }catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }


    }
}
