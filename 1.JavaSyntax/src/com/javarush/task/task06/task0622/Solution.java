package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInitial = new int[5];
        //напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            arrayInitial[i] = Integer.parseInt(reader.readLine());
        }
        bubbleSorting(arrayInitial);
        for (int i = 0; i < arrayInitial.length; i++) {
            System.out.println(arrayInitial[i]);
        }
    }

    private static int[] bubbleSorting(int[] arraySort) {
        int bubble;
        for (int i = 0; i < arraySort.length; i++) {
            for (int j = 1; j < (arraySort.length - i); j++) {
                if (arraySort[j - 1] > arraySort[j]) {
                    bubble = arraySort[j - 1];
                    arraySort[j - 1] = arraySort[j];
                    arraySort[j] = bubble;
                }
            }
        }
        return arraySort;
    }
}
