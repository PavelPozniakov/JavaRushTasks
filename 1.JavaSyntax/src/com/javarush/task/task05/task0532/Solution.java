package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int qty = Integer.parseInt(reader.readLine());
        int maximum=Integer.MIN_VALUE;
        if (qty>0) {
            for (int i = 0; i < qty; i++) {
                int number = Integer.parseInt(reader.readLine());
                if (number>=maximum) maximum=number;
            }
        }
        //напишите тут ваш код

        System.out.println(maximum);
    }
}
