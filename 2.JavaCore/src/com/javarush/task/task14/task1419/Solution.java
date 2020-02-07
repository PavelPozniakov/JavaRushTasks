package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            for (int i = 1; i <= exceptions.size() ; i++) {
                System.out.println(exceptions.get(i));
            }

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            reader.close();
            reader.readLine();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object doub = 10.1;
            Boolean b = (Boolean) doub;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Double doub = null;
            doub = doub++;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int a = Integer.parseInt(null);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object[] s = new Integer[4];
            s[0] = 4.4;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            final String CLASS_TO_LOAD = "main.java.Utils";
            Class loadedClass = Class.forName(CLASS_TO_LOAD);
            System.out.println("Class " + loadedClass + " found successfully!");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            final String filename = "input.txt";
            BufferedReader rd = null;
            rd = new BufferedReader(new FileReader(new File(filename)));
            String inputLine = null;
            while((inputLine = rd.readLine()) != null)
                System.out.println(inputLine);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String str = "Java";
            char ch = str.charAt(50);
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
