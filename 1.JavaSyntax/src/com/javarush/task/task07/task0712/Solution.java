package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int indexLong=0;
        int indexShort=Integer.MAX_VALUE;
        int strLong=0;
        int strShort=Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            strings.add(s);
            if (s.length()>strLong) {
                indexLong=i;
                strLong=s.length();
            }
            if (s.length()<strShort) {
                indexShort=i;
                strShort=s.length();
            }
        }
        if (indexLong<indexShort) {
            System.out.println(strings.get(indexLong));
        } else {
            System.out.println(strings.get(indexShort));
        }
    }
}
