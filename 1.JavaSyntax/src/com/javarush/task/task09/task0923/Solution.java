package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> novowels = new ArrayList<>();
        String someString = reader.readLine();
        for (int i = 0; i < someString.length(); i++) {
            if (isVowel(someString.charAt(i))){
                System.out.print(someString.charAt(i)+" ");
            } else if (someString.charAt(i)==' ') {

            } else {
                novowels.add(someString.charAt(i));
            }
        }
        System.out.println();
        for (int i = 0; i < novowels.size(); i++) {
            System.out.print(novowels.get(i)+" ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}