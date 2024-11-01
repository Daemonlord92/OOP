package org.horrorcore_healthcare;
// What is Polymorphism
public class Calculator {
    //not can we add integers, but we add double, floats.
    //Compile Time Polymorphism
    //Method Overloading
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}
