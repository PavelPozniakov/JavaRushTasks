package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            boolean doubleB;
            boolean integerB;
            boolean shortB;
            try {
                Double.valueOf(key);
                doubleB = true;
            } catch (NumberFormatException e) {
                doubleB = false;
            }
            try {
                integerB = Integer.parseInt(key)>=128 || Integer.parseInt(key)<=0;
                shortB = Integer.parseInt(key)<128 && Integer.parseInt(key)>0;
            } catch (NumberFormatException e) {
                integerB = false;
                shortB = false;
            }
            if (key.contains(".") && doubleB) {
                print(Double.valueOf(key));
            } else if (integerB) {
                print(Integer.parseInt(key));
            } else if (shortB) {
                print((short) Integer.parseInt(key));
            } else {
                print(key);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
