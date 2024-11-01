package org.horrorcore_healthcare;

public class Animal {
    // What is Encapsulation
    // We're hiding the direct field variables
    // this will prevent outside direct interactions
    // Private Variables
    private String name;
    private int age;

    public Animal() {}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Public Getters/Setters/Data Hiding
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
