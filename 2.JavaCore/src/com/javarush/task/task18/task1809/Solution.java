package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());
        ArrayList<Integer> bytes  = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            bytes.add(data);
        }
        Collections.reverse(bytes);
        for (Integer integer : bytes) {
            outputStream2.write(integer);
        }
        fileInputStream.close();
        outputStream2.close();

    }
}
