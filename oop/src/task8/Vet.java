package task8;

public class Vet  {
    private String fio;

    public Vet() {
    }

    public Vet(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Врач: " + getFio());
        System.out.println("Информация о животном: " + '\n' + animal.getInfo());
    }
}
