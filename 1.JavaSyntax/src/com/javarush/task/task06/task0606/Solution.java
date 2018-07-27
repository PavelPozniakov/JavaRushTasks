package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        for (int i=0; i<sNumber.length();i++) {
            int number = Integer.parseInt(sNumber.substring(i,i+1));
            evenOrOdd(number);
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }

    private static void evenOrOdd(int i){
        if (i%2==0) even++;
        else odd++;
    }
}
