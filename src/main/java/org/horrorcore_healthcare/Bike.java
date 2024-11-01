package org.horrorcore_healthcare;

public class Bike extends Vehicle {

    public Bike() {
    }

    public Bike(int speed, int acceleration, int maxSpeed, int gears) {
        super(speed, acceleration, maxSpeed, gears);
    }

    @Override
    void accelerate() {
        this.setSpeed(this.getSpeed() + this.getAcceleration());
        System.out.println("We are now traveling at ".concat(String.valueOf(this.getSpeed())));
    }

    @Override
    void decelerate() {
        this.setSpeed(this.getSpeed() - this.getAcceleration());
        System.out.println("We are now traveling at ".concat(String.valueOf(this.getSpeed())));
    }

    @Override
    void changeGears() {
        if (this.getGears() == 13) {
            this.setGears(this.getGears() - 1);
        } else if (this.getGears() >= 0) {
            this.setGears(this.getGears() + 1);
        }
    }
}
