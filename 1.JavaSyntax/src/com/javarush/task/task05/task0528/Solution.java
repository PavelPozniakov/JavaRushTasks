package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate localDate = LocalDate.now();
        System.out.println(dtf.format(localDate));
    }
}
