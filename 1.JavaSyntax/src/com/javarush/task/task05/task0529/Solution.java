package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        int number=0;
        int i=0;
        while (i==0) {
            String str = reader.readLine();
            if (!str.equals("сумма")) {
                number = Integer.parseInt(str);
                sum += number;
            } else {
                System.out.println(sum);
                i=1;
            }
        }
    }
}
