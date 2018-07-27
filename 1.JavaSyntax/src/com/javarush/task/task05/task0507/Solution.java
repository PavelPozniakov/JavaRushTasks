package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum=0;
        int number=0;
        int count=0;
        double result=0;
        for (;number!=-1;) {
            number = Integer.parseInt(reader.readLine());
            if (number!=-1) {
                sum+=number;
                count++;
            }
        }
        result=sum/count;
        System.out.println(result);
    }
}

