package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        Solution.labels.put((double) 1,"1");
        Solution.labels.put((double) 2,"2");
        Solution.labels.put((double) 3,"3");
        Solution.labels.put((double) 4,"4");
        Solution.labels.put((double) 5,"5");
    }

    public static void main(String[] args) {

        System.out.println(labels);
    }
}
