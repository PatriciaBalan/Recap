package io;

import java.io.*;

public class ReadFromFile {

    public static void main(String[] args) throws IOException {

        int countWords = 0;
        int countSymbol = 0;
        int countTimes1Word = 0;
        String[] s = null;
        String st;

        File file = new File ("C:\\Java\\01_Teorie\\RECAP\\loremipsum.txt");

        BufferedReader bf = new BufferedReader(new FileReader(file));

        try {
            while ((st = bf.readLine()) != null) {
                System.out.println(st);
                s = st.split(" ");
                countWords = countWords + s.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(countWords);

        try {
            while ((st = bf.readLine()) != null) {
                if (st.matches("[$&+,:;=?@#|'<>.-^*()%!\b\t\n]")) {
                    countSymbol++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(countSymbol);
    }
}
