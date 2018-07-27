package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayBig = new int[20];
        int[] arrayS1 = new int[10];
        int[] arrayS2 = new int[10];
        for (int i = 0; i < arrayBig.length; i++) {
            arrayBig[i]=Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < arrayBig.length ; i++) {
            if (i<arrayS1.length) {
                arrayS1[i] = arrayBig[i];
            } else {
                arrayS2[i-arrayS1.length] = arrayBig[i];
            }
        }
        for (int i = 0; i < arrayS2.length; i++) {
            System.out.println(arrayS2[i]);
        }
    }
}
