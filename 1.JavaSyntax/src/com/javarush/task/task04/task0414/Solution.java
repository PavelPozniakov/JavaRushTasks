package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int days=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        if (year%4!=0 || (year%100==0 && year%400!=0) ){
            days=365;
        } else days=366;
        System.out.println("количество дней в году: "+days);
    }
}