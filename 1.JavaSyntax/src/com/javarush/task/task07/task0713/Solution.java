package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> threeList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> otherList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            int numb = Integer.parseInt(reader.readLine());
            mainList.add(numb);
            if (numb%3==0){
                threeList.add(numb);
            }
            if (numb%2==0) {
                evenList.add(numb);
            }
            if (numb%3!=0 && numb%2!=0) {
                otherList.add(numb);
            }
        }
        printList(threeList);
        printList(evenList);
        printList(otherList);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
