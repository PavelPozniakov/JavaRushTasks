package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream3 = new FileOutputStream(reader.readLine());
        reader.close();
        if (fileInputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[fileInputStream.available()];
            int count = fileInputStream.read(buffer);
            if (count%2==0) {
                outputStream2.write(buffer, 0, count/2);
                outputStream3.write(buffer, count/2, count/2);
            } else {
                outputStream2.write(buffer, 0, count/2+1);
                outputStream3.write(buffer, count/2+1, count/2);
            }

        }
        fileInputStream.close();
        outputStream2.close();
        outputStream3.close();

    }
}
