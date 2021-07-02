package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String producer, carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car() {

    }

    public Car (String producer, String carClass, int weight, Driver driver, Engine engine) {
        this.producer = producer;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }


    public static void start() {
        System.out.println("Поехали!");
    }

    public static void stop() {
        System.out.println("Останавливаемся!");
    }

    public static void turnRight() {
        System.out.println("Поворот направо!");
    }

    public static void turnLeft() {
        System.out.println("Поворот налево!");
    }

    public String toString() {
        return "Марка автомобиля: " + this.producer + '\n' +
                "Класс автомобиля: " + this.carClass + '\n' +
                "Вес: " + this.weight  + '\n' +
                this.driver.toString() +
                this.engine.toString();
    }

    public static void main(String[] args) {
        Driver driver1 = new Driver();
        driver1.setFio("Ильина А.А.");
        driver1.setExperience(5);

        Driver driver2 = new Driver ("Иванов И.И.", 10);
        Driver driver3 = new Driver("Шумахер М.",20);

        Engine engine1 = new Engine(300, "Volvo");

        Engine engine2 = new Engine(250, "Ford");

        Engine engine3 = new Engine();
        engine3.setMaker("Bentley");
        engine3.setPower(600);

        Engine engine4 = new Engine(300,"Камаз");

        Car car1 = new Car("Volvo", "E", 600, driver1, engine1);

        Car car2 = new Car("Ford Focus", "C", 800, driver2, engine2);

        Car car3 = new SportCar("Bentley","Sport",500,driver3,engine3,600);

        Lorry car4 = new Lorry("Камаз", "Грузовые",900,driver2,engine4,2000);
        System.out.println(car1.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());

        car1.start();
        car2.stop();
        car3.turnLeft();
        car4.turnRight();
    }

}
