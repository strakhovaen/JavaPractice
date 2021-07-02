package task8;

public class Animal {
    private String food;
    private String location;

    public Animal() {

    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInfo() {
        return "Корм: " + getFood() + '\n' +
                "Место проживания: " + '\n';
    }

    public void makeNoise() {
        System.out.println("орёт");
    }

    public void eat() {
        System.out.println("ест " + this.food);
    }

    public void sleep() {
        System.out.println("Такое-то животное спит");
    }


    public static void main(String[] args) {
        Animal cat = new Cat("Purina", "Казань", 4.3);
        Animal dog = new Dog("Royal Canin", "Казань", "доберман");
        Animal horse = new Horse("сено", "Васильево", "нет");

        Vet vet1 = new Vet("Иванов И.И.");

        Animal[] animals = {cat, dog, horse};

        for (Animal pet: animals) {
            vet1.treatAnimal(pet);
            pet.makeNoise();
            System.out.println();
        }

    }

}
