package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        return anotherCat.age < this.age && anotherCat.strength < this.strength && anotherCat.weight < this.weight;
    }

    public static void main(String[] args) {
        Cat cat2 = new Cat();
        cat2.strength=8;
        cat2.age=3;
        cat2.weight=4;

        Cat cat1 = new Cat();
        cat1.strength=10;
        cat1.age=4;
        cat1.weight=5;

        cat1.fight(cat2);
        cat2.fight(cat1);
    }
}
