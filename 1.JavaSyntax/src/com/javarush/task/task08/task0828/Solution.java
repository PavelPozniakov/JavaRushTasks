package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        HashMap<Integer, String> monthes = new HashMap<>();
        monthes.put(1,"January");
        monthes.put(2,"February");
        monthes.put(3,"March");
        monthes.put(4,"April");
        monthes.put(5,"May");
        monthes.put(6,"June");
        monthes.put(7,"July");
        monthes.put(8,"August");
        monthes.put(9,"September");
        monthes.put(10,"October");
        monthes.put(11,"November");
        monthes.put(12,"December");
        int month =0;
        for (Map.Entry<Integer,String> pair : monthes.entrySet()) {
            if (pair.getValue().equals(str)) {
                month = pair.getKey();
            }
        }
        System.out.println(str + " is the " + month + " month");
    }
}
