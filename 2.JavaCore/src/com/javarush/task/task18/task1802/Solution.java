package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        reader.close();
        InputStream fileInputStream = new FileInputStream(sourceFileName);

        Integer maxBite = fileInputStream.read();
        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            if (maxBite>data) {
                maxBite = data;
            }
        }
        fileInputStream.close();
        System.out.println(maxBite);
    }
}
