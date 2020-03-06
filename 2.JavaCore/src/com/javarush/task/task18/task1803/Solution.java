package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

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
       // Integer maxCount = map.values().parallelStream().max(Integer::compareTo).get();
        printMap(map);
    }

    private static void printMap(Map<Integer,Integer> map){
        String s = "";
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue()>2) {
                s = s.concat(pair.getKey().toString()).concat(" ");
            }
        }
        System.out.print(s.substring(0,s.length()-1));
    }
}
