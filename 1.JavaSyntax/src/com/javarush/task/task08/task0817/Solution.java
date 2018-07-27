package com.javarush.task.task08.task0817;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        Collection<String> someColl = copy.values();
        for (String s : someColl) {
            int count = 0;
            for (String sCheck : someColl) {
                if (s.equals(sCheck)){
                    count++;
                }
                if (count>1) {
                    removeItemFromMapByValue(map,s);
                    break;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}
