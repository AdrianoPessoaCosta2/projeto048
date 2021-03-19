package main.java.p047;

import main.java.p047.batch.file.processor.FileProcessor;

public class run {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.fileReader("/home/apc/Documents/projeto048/src/main/resources/binario.bin", "First");


//        int charCode = Integer.parseInt(receivedFile, 2);
//        String str = new Character((char)charCode).toString();
//        System.out.printf(str);
    }
}
