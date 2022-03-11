package com.company;

public class Main {

    private static String name;

    public static void main(String[] args) {
	// write your code here


        Shelter shelter = new Shelter("Ramashka", "Pervamayskiy 1");
        System.out.println(shelter.toString());
        System.out.println("---");


        Dog dog = new Dog("Rex", "Ovcharka", shelter, EnumColor.BLACK);
        System.out.println(dog.getInfo());
    }

}
