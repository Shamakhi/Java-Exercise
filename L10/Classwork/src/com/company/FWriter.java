package com.company;
import java.io.*;
public class FWriter implements Runnable {

    private static FWriter instance=new FWriter();

   public static FWriter getInstance(){return instance;}
    private FWriter(){}
    @Override
    public void run() {

        File file = new File("src/com/company/F2.txt");

        try {

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(FReader.getInstance().getFContent());
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
