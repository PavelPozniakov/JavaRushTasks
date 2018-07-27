package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> someList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            someList.add(Integer.parseInt(reader.readLine()));
        }
        int max=0;
        int currMax=1;
        for (int i = 0; i < someList.size()-1; i++) {
            if (someList.get(i).intValue()==someList.get(i+1).intValue()){
                currMax++;
            } else {
                if (currMax>max) {
                    max = currMax;
                }
                currMax=1;
            }
        }
        if (currMax>max) {
            max = currMax;
        }
        System.out.println(max);
    }
}