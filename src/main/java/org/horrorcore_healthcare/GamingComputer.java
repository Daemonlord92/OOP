package org.horrorcore_healthcare;

import java.io.Serializable;
import java.sql.SQLOutput;

public class GamingComputer implements Computer, Serializable {

    private String computerName;
    private int computerID;
    private int ram;
    private int cpu;
    private int memory;

    public GamingComputer() {}

    public GamingComputer(String computerName, int computerID, int ram, int cpu, int memory) {
        this.computerName = computerName;
        this.computerID = computerID;
        this.ram = ram;
        this.cpu = cpu;
        this.memory = memory;
    }

    // Runtime Polymorphism
    // Method Overriding
    @Override
    public void run() {
        System.out.println("Computer " + computerName + " is running DooM95");
    }

    @Override
    public void stop() {
        System.out.println("Computer " + computerName + " is stopped running DooM95");
    }

    @Override
    public void start() {
        System.out.println("Computer " + computerName + " started");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer " + computerName + " turned off");
    }
}
