package com.company.details;

public class Engine {
    private int power;
    private String maker;

    public Engine() {

    }

    public Engine(int power, String maker) {
        this.power = power;
        this.maker = maker;
    }

    public int getPower() {
        return power;
    }

    public String getMaker() {
        return maker;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String toString() {
        return "Мощность мотора: " + this.power + '\n' +
                "Мотор (производитель): " + this.maker + '\n';
    }
}
