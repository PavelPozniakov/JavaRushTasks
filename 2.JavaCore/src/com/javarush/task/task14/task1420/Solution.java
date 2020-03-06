package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b;
        if (a<=0) {
            throw new RuntimeException();
        } else {
            b = Integer.parseInt(reader.readLine());
            if (b<=0) {
                throw new RuntimeException();
            }
        }
            System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
