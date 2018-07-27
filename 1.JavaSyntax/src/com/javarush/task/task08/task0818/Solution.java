package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String,Integer> someMap = new HashMap<>();
        someMap.put("Ivanov",500);
        someMap.put("Petrov",100);
        someMap.put("Vodkin",200);
        someMap.put("Sidorov",600);
        someMap.put("Koltsov",700);
        someMap.put("Lipov",300);
        someMap.put("Fonarev",400);
        someMap.put("Gagarin",800);
        someMap.put("Lenon",900);
        someMap.put("Kartsev",501);
        return someMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(mapEntry -> mapEntry.getValue() < 500);
    }

    public static void main(String[] args) {
    }
}