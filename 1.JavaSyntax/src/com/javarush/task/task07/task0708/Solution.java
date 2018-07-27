package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        int longestStr=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
            if (s.length()>longestStr) {
                longestStr=s.length();
            }
        }
        for (int i = 0; i < strings.size() ; i++) {
            if (strings.get(i).length()==longestStr) {
                System.out.println(strings.get(i));
            }
        }
    }
}
