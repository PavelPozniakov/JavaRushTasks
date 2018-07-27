package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
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
        someMap.put("Kartsev","Petr");
        return someMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int number =0;
        for (Map.Entry<String,String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                number++;
            }
        }
        return number;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int number =0;
        for (Map.Entry<String,String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                number++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
    }
}
