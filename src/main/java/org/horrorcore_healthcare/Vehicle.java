package org.horrorcore_healthcare;

//What is Abstraction
public abstract class Vehicle {
    private int speed;
    private int acceleration;
    private int maxSpeed;
    private int gears;

    public Vehicle() {}

    public Vehicle(int speed, int acceleration, int maxSpeed, int gears) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
        this.gears = gears;
    }

    //Abstract Methods
    // They don't have defined method body
    // This pushes into the idea of inheritance
    abstract void accelerate();
    abstract void decelerate();
    abstract void changeGears();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
}
