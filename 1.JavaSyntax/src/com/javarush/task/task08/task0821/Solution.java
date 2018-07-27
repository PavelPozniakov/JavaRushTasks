package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String,String> someMap = new HashMap<>();
        someMap.put("Ivanov","Ivan");
        someMap.put("Petrov","Petr");
        someMap.put("Vodkin","Vova");
        someMap.put("Sidorov","Sidor");
        someMap.put("Koltsov","Kolya");
        someMap.put("Lipov","Petr");
        someMap.put("Fonarev","Petr");
        someMap.put("Gagarin","Ivan");
        someMap.put("Lenon","Pavel");
        someMap.put("Lenon","Petr");
        return someMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
