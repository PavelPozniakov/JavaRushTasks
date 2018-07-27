package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> catsMap = new HashMap<>();
        catsMap.put("Vaska",new Cat("Vaska"));
        catsMap.put("Murka",new Cat("Murka"));
        catsMap.put("Duska",new Cat("Duska"));
        catsMap.put("Barsik",new Cat("Barsik"));
        catsMap.put("Murzik",new Cat("Murzik"));
        catsMap.put("Rizhik",new Cat("Rizhik"));
        catsMap.put("Nochka",new Cat("Nochka"));
        catsMap.put("Motka",new Cat("Motka"));
        catsMap.put("Sonia",new Cat("Sonia"));
        catsMap.put("Harvi",new Cat("Harvi"));
        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> catsSet = new HashSet<>(map.values());
        return catsSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
