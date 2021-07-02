package com.company.professions;

public class Driver {
    private String fio;
    private int experience;

    public Driver() {

    }

    public Driver(String fio, int experience) {
        this.fio = fio;
        this.experience = experience;
    }

    public String getFio() {
        return fio;
    }

    public int getExperience() {
        return experience;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String toString() {
        return "Водитель: " + this.fio + '\n' +
                "Ствж водителя: " + this.experience + '\n';
    }
}
