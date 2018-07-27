package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int bubble=0;
        if (a>=c) {
            bubble=a;
            a=c;
            c=bubble;
        }
        if (b>=c) {
            bubble=b;
            b=c;
            c=bubble;
        }
        if (a>=b) {
            bubble=a;
            a=b;
            b=bubble;
        }
        System.out.println(b);
    }
}
