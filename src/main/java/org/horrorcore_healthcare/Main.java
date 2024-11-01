package org.horrorcore_healthcare;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //animal.name = "Dog";

        Vehicle bike = new Bike(0, 5, 50, 0);

        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.decelerate();

        Computer computer = new GamingComputer("MSI Raider", 1, 16, 7, 1);

        computer.run();
        computer.start();
    }
}