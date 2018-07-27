package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        int longestStr=Integer.MAX_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
            if (s.length()<longestStr) {
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
