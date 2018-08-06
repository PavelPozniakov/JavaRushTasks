package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] all = new ArrayList[2];
        ArrayList<String> arrayStr1 = new ArrayList<String>();
        ArrayList<String> arrayStr2 = new ArrayList<String>();
        arrayStr1.add("1");
        arrayStr2.add("2");
        all[0] = arrayStr1;
        all[1] = arrayStr2;

        return all;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}