package org.example;

import java.io.*;
import java.nio.charset.Charset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //  초기화 필드
        FileReader fr = null;
        String path = "C:\\JYLIM\\Sample_Data\\fileReaderSample.csv";

        try {
            fr = new FileReader(path, Charset.forName("MS949"));
            //BufferedReader br = null;

            //fr = new BufferedReader("")
            //

            System.out.println("파일이름 : " + new File(path).getName());
            System.out.println("파일길이 : " + new File(path).length());

            int filesize = (int) new File(path).length();

            char bar[] = new char[filesize];

            String row [] = new String[filesize];

            int n = fr.read(bar);

            int start = 0;

            for (int i = 0; i < n; i++) {

                if(bar[i] == '\n') {
                    start = i+1;
                    break;
                }
            }
            for (int i = start; i < n; i++) {
                //System.out.println("bar = " + bar[i]);
                if(bar[i] != '\n') {


                }

                System.out.println("bar = " + bar[i] + " (" + (int) bar[i] + ")");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {

            e.printStackTrace();
        } finally {
            try {
                fr.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}