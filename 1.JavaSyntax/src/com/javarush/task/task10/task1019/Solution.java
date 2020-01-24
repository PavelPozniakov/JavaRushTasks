package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer index =0;
        String name="1";
        HashMap<String,Integer> map = new HashMap<>();
        while (!name.equals("") || index!=null) {
            String  s = reader.readLine();
            if (s.isEmpty()) {break;
            } else {
                index = Integer.parseInt(s);
            }
            s = reader.readLine();
            if (s.isEmpty()) {
                name = s;
                map.put(name,index);
                break;
            } else {
                name = s;
                map.put(name,index);
            }
        }

        for (Map.Entry<String,Integer> pair : map.entrySet()) {
            name = pair.getKey();
            index = pair.getValue();
            System.out.println(index + " " + name);
        }
/*
        int id = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        System.out.println("Id=" + id + " Name=" + name);*/
    }
}
