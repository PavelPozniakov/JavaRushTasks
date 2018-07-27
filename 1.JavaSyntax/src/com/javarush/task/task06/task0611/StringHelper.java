package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<5;i++) {
            stringBuilder=stringBuilder.append(s);
        }
        result = stringBuilder.toString();
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<count;i++) {
            stringBuilder=stringBuilder.append(s);
        }
        result = stringBuilder.toString();
        return result;
    }

    public static void main(String[] args) {
    }
}
