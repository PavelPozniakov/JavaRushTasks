package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;

        //напишите тут ваш код
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            int newNumb = Integer.parseInt(reader.readLine());
            array[i]=newNumb;
            if (newNumb>maximum) {
                maximum=newNumb;
            }
            if (newNumb<minimum) {
                minimum=newNumb;
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
