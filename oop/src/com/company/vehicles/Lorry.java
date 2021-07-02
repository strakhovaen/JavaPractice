package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry() {

    }

    public Lorry(String producer, String carClass, int weight, Driver driver, Engine engine, int carrying) {
        super(producer, carClass, weight, driver, engine);
        this.carrying= carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }


    public String toString() {
        return super.toString() +
                "Грузоподьёмность: " + this.carrying + '\n';
    }

}
