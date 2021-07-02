package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    int speed;

    public SportCar() {

    }

    public SportCar(String producer, String carClass, int weight, Driver driver, Engine engine, int speed) {
        super(producer, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String toString() {
        return super.toString() +
                "Предельная скорость: " + this.speed + '\n';
    }
}
