package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> someList = new ArrayList<>();
        someList.add("firstString");
        someList.add("secondString");
        someList.add("thirdString");
        someList.add("fourthString");
        someList.add("lastString");

        System.out.println(someList.size());
        for (int i = 0; i < someList.size() ; i++) {
            System.out.println(someList.get(i));
        }
    }
}
