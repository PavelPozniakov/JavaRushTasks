package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> someList = new ArrayList<>();
        someList.add("мама");
        someList.add("мыла");
        someList.add("раму");
        for (int i = 0; i <= someList.size(); i++) {
            if(i%2!=0) {
                someList.add(i,"именно");
            }
        }
        printList(someList);
    }

    public static void printList(List<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
