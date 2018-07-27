package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        int[] alphabetCount = new int[abcArray.length];
        for (String s: list) {
            for (int i = 0; i < s.length(); i++) {
                if (abc.indexOf((s.charAt(i)))>=0) {
                    alphabetCount[alphabet.indexOf(s.charAt(i))]++;
                }
            }
        }
        for (int i = 0; i < alphabetCount.length; i++) {
            System.out.println(alphabet.get(i) + " " + alphabetCount[i]);
        }
    }

    //check if String contains char
    public boolean containsChar(String s, char search) {
        if (s.length() == 0)
            return false;
        else
            return s.charAt(0) == search || containsChar(s.substring(1), search);
    }
}
