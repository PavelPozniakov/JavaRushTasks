package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> someSet = new HashSet<>();
        someSet.add("арбуз");
        someSet.add("банан");
        someSet.add("вишня");
        someSet.add("груша");
        someSet.add("дыня");
        someSet.add("ежевика");
        someSet.add("женьшень");
        someSet.add("земляника");
        someSet.add("ирис");
        someSet.add("картофель");

        for (String s:someSet) {
            System.out.println(s);
        }
    }
}
