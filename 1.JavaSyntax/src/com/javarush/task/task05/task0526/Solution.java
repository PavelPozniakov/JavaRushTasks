package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Vasia",15,"Kiev");
        Man man2 = new Man("Kolia", 17, "Lviv");
        Woman woman1 = new Woman("Olia", 16, "Zhitomyr");
        Woman woman2 = new Woman("Yulia", 20, "Odessa");

        man1.printObj();
        man2.printObj();
        woman1.printObj();
        woman2.printObj();

    }

    //напишите тут ваш код
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }

        public void printObj(){
            System.out.println(this.name + " " + this.age + " " + this.address);
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }

        public void printObj(){
            System.out.println(this.name + " " + this.age + " " + this.address);
        }
    }
}
