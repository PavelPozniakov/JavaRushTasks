package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grantFatherName = reader.readLine();
        Cat catGrantFather = new Cat(grantFatherName);

        String grantMotherName = reader.readLine();
        Cat catGrantMother = new Cat(grantMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null,catGrantFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrantMother,null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrantFather);
        System.out.println(catGrantMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentM;
        private Cat parentF;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentF, Cat parentM) {
            this.name = name;
            this.parentF = parentF;
            this.parentM = parentM;
        }

        @Override
        public String toString() {
            if (parentF == null &&parentM == null) {
                return "Cat name is " + name + ", no mother, no father";
            } else if (parentF == null) {
                return "Cat name is " + name + ", no mother, father is " + parentM.name;
            } else if (parentM == null) {
                return "Cat name is " + name + ", mother is " + parentF.name + ", no father";
            } else {
                return "Cat name is " + name + ", mother is " + parentF.name + ", father is " + parentM.name;
            }
        }
    }

}
