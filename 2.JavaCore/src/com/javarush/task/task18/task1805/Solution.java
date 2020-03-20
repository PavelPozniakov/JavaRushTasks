package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        reader.close();
        InputStream fileInputStream = new FileInputStream(sourceFileName);
        Map<Integer,Integer> map = new HashMap<>();
        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            map.put(data,map.getOrDefault(data,0)+1);
        }
        fileInputStream.close();
        printMap(map);
    }

    private static void printMap(Map<Integer,Integer> map){
        String s = map.keySet().stream().sorted().collect(Collectors.toList()).toString();
        System.out.print(s.replaceAll("[,\\[\\]]",""));
    }
}
