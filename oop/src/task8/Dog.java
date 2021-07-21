package task8;

public class Dog extends Animal {
    private String breed;

    public Dog() {
    }

    public Dog(String food, String location, String breed) {
        super(food,location);
        this.breed = breed;
    }


    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void setFood(String food) {
        super.setFood(food);
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getInfo() {
        return "Вид: собака" + '\n' +
                super.getInfo() +
                "Порода: " + this.getBreed() + '\n';
    }


    public void makeNoise() {
        System.out.println("Гав!");
    }

    public void eat() {
        System.out.println("Собака ест " + this.getFood());
    }

    public void sleep() {
        System.out.println("Собака спит");
    }
}
