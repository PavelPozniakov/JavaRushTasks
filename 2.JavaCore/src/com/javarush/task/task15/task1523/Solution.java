package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }

    private int f1 = 7;
    public Solution(int f1) {
        this.f1 = f1;
    }
    protected Solution(Integer f1) {
        this.f1 = f1;
    }
    Solution(short f1) {
        this.f1 = f1;
    }
    private Solution() {
    }
}

