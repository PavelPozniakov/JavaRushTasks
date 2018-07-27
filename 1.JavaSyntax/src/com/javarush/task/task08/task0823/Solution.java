package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.replaceAll(" +"," ");
        //напишите тут ваш код
        for (String iter : s.split(" ")) {
            if (iter.length() != 0 ) {
                System.out.print(iter.substring(0, 1).toUpperCase() + iter.substring(1) + " ");
            }
        }
    }
}
