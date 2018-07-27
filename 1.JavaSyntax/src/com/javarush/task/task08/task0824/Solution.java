package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human father = new Human("Father", 57,true, new ArrayList<Human>());
        Human mother = new Human("Mother", 51,true, new ArrayList<Human>());
        Human babka1 = new Human("Babka1", 91,true, new ArrayList<Human>());
        Human babka2 = new Human("Babka2", 81,true, new ArrayList<Human>());
        Human ded1 = new Human("Ded1", 87,true, new ArrayList<Human>());
        Human ded2 = new Human("Ded2", 97,true, new ArrayList<Human>());

        Human son1 = new Human("Son1", 7,true, new ArrayList<Human>());
        Human son2 = new Human("Son2", 17,true, new ArrayList<Human>());
        Human son3 = new Human("Son3", 27,true, new ArrayList<Human>());

        father.children.add(son1);
        father.children.add(son2);
        father.children.add(son3);
        mother.children.add(son1);
        mother.children.add(son2);
        mother.children.add(son3);
        babka1.children.add(father);
        babka2.children.add(mother);
        ded1.children.add(father);
        ded2.children.add(mother);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(babka1.toString());
        System.out.println(babka2.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        int age;
        boolean sex;
        ArrayList<Human> children;

        public Human(String name, int age, boolean sex, ArrayList<Human> children) {
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.children = children;
        };

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
