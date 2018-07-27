package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double minutes = Double.parseDouble(reader.readLine());
        if (minutes%5==0 || minutes%5<3) System.out.println("зелёный");
        else if (minutes%5>=3 && minutes%5<4) System.out.println("жёлтый");
        else if (minutes%5>=4) System.out.println("красный");
    }
}