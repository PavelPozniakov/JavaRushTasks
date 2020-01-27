package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        reader.close();
        InputStream fileInputStream = getInputStream(sourceFileName);
        BufferedReader fin = new BufferedReader(new InputStreamReader(fileInputStream));
        String line;
        ArrayList<Integer> set = new ArrayList<>();
        while ((line = fin.readLine()) != null) {
            set.add(Integer.parseInt(line));
        }
        set.removeIf(s -> (s % 2) != 0);
        Collections.sort(set);
        for (Integer i: set
             ) {
            System.out.println(i);
        }

        fileInputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }
}
