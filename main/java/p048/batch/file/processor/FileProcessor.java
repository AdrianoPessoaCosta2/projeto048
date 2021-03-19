package main.java.p047.batch.file.processor;

import java.io.*;

public class FileProcessor {

    public void fileReader(String receivedFile, String outputFile) {

        int charCode = Integer.parseInt(receivedFile, 2);
        String str = new Character((char) charCode).toString();


        File received = new File(str);
        File output = new File(outputFile.concat(".txt"));
        try {
            FileInputStream fileInputStream = new FileInputStream(received);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int var = 0;
            while ((var = bufferedInputStream.read()) != -1) {
                byteArrayOutputStream.write(var);
            }
            bufferedInputStream.close();


            FileOutputStream outputStream = new FileOutputStream(output);


            outputStream.write(byteArrayOutputStream.toByteArray());

            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
