package JavaBasics.TypeCasting;


class Animal { }

class Dog extends Animal { }

class Cat extends Animal { }

public class TypeCastingUserDefinedClasses {
    public static void main(String[] args) {
    /* Cat c = (Cat) a ;
       A   b   C    d
      Rule1: conversion is valid or not.
                 The type of 'd' & 'c' must have some relationship (either parent to child / child to parent)
      Rule2: assignment is valid or not
               'C' must be either same or child of 'A'
      Rule3: the underlying object of 'd' must be either same or child of 'C'
    */

        Animal a = new Dog();
        // Dog d= new Dog();
        // Cat c1=(Cat) d; //invalid as per rule 1

        //  Animal a1=new Animal();
        //  Cat c2=( Cat) a1; //valid as per rule 2

        // Cat c3=(Dog) a; //invalid as per rule 2

        //  Cat c4=(Cat)a; //invalid as per rule 3. runtime error

        Dog dg = (Dog) a; //valid as per all 3 rules.
    }
}
