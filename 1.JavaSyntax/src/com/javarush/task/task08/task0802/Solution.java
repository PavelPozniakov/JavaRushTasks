package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String,String> someMap = new HashMap<>();
        someMap.put("арбуз","ягода");
        someMap.put("банан","трава");
        someMap.put("вишня","ягода");
        someMap.put("груша","фрукт");
        someMap.put("дыня","овощ");
        someMap.put("ежевика","куст");
        someMap.put("жень-шень","корень");
        someMap.put("земляника","ягода");
        someMap.put("ирис","цветок");
        someMap.put("картофель","клубень");

        for (Map.Entry<String,String> pair : someMap.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
