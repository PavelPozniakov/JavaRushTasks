package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            InputStream fileInputStream = new FileInputStream(Statics.FILE_NAME);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
            String rp = reader.readLine();
            while (rp != null) {
                lines.add(rp);
                rp = reader.readLine();
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
