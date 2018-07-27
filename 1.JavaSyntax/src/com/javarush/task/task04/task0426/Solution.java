package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String number = "ноль";
        if (a>0) number="положительное";
        else if (a<0) number="отрицательное";
        if (a%2==0) number=number+" четное число";
        else if (a%2!=0) number=number+" нечетное число";
        if (a==0) number = "ноль";
        System.out.println(number);
    }
}
