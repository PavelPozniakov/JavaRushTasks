package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String number = "ноль";
        if (a%2==0) number="четное";
        else if (a%2!=0) number="нечетное";
        if (a/100>=1) number=number+" трехзначное число";
        else if (a/10>=1) number=number+" двузначное число";
        else number=number+" однозначное число";
        if (a>=1 && a<=999) System.out.println(number);
    }
}
