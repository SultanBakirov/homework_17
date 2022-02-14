package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] animal = {new Shark(), new Turtle(), new Eagle()};

        for (Animal a: animal) {
            if (a.getClass().getName().equals("com.company.Shark")) {
                System.out.print("It is using getclass: ");
                ((Shark) a).attack();
            }
        }
        for (Animal a: animal) {
            if (a instanceof Shark) {
                System.out.print("It is using instanceof: ");
                ((Shark) a).attack();
            }
        }

        for (Animal a: animal) {
            if (a.getClass().getName().equals("com.company.Turtle")) {
                System.out.print("It is using getclass: ");
                ((Turtle) a).swim();
            }
        }
        for (Animal a: animal) {
            if (a instanceof Turtle) {
                System.out.print("It is using instanceof: ");
                ((Turtle) a).swim();
            }
        }

        for (Animal a: animal) {
            if (a.getClass().getName().equals("com.company.Eagle")) {
                System.out.print("It is using getclass: ");
                ((Eagle) a).fly();
            }
        }
        for (Animal a: animal) {
            if (a instanceof Eagle) {
                System.out.print("It is using instanceof: ");
                ((Eagle) a).fly();
            }
        }

        Shark[] shark = new Shark[animal.length];
        Turtle[] turtle = new Turtle[animal.length];
        Eagle[] eagle = new Eagle[animal.length];
        System.out.println(shark.length);
        System.out.println(turtle.length);
        System.out.println(eagle.length);
    }
}
