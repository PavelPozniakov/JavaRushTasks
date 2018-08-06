package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private int age;
        private boolean sex;
        private String name;
        private int childs;
        private String pet;
        private boolean homeless;

        public Human(){}

        public Human(int age, boolean sex, String name, int childs, String pet, boolean homeless){
            this.age=age;
            this.childs=childs;
            this.homeless=homeless;
            this.name=name;
            this.pet=pet;
            this.sex=sex;
        }

        public Human(int age, boolean sex, String name) {
            this.age = age;
            this.sex = sex;
            this.name = name;
        }

        public Human(int age, boolean sex, String name, int childs, String pet) {
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.childs = childs;
            this.pet = pet;
        }

        public Human(int age, boolean sex, String name, boolean homeless) {
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.homeless = homeless;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(boolean sex, String name) {
            this.sex = sex;
            this.name = name;
        }

        public Human(String name, String pet) {
            this.name = name;
            this.pet = pet;
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String pet, boolean homeless) {
            this.name = name;
            this.pet = pet;
            this.homeless = homeless;
        }
    }
}
