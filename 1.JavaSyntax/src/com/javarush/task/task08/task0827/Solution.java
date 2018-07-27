package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2000"));
    }

    public static boolean isDateOdd(String date) {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Calendar dd = Calendar.getInstance();
        try {
            dd.setTime(df.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (dd.get(Calendar.DAY_OF_YEAR)%2!=0) {
            return true;
        } else {
            return false;
        }
    }
}
