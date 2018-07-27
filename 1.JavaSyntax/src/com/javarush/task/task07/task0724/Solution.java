package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandFF = new Human("Ded-1", true, 98);
        Human grandMF = new Human("Babka-1", false, 97);
        Human grandFM = new Human("Ded-2", true, 96);
        Human grandMM = new Human("Babka-2", false, 95);
        Human mother = new Human("Mom", false, 45,grandFM,grandMM);
        Human father = new Human("Dad", true, 50,grandFF,grandMF);
        Human son1 = new Human("Son-1", true, 15,father,mother);
        Human son2 = new Human("Son-2", true, 10,father,mother);
        Human son3 = new Human("Son-3", true, 5,father,mother);

        System.out.println(grandFF.toString());
        System.out.println(grandMF.toString());
        System.out.println(grandFM.toString());
        System.out.println(grandMM.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }

        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















