package task8;

public class Cat extends Animal {
    double weight;

    public Cat() {

    }

    public Cat(String food, String location, double weight) {
        super(food,location);
        this.weight = weight;
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void setFood(String food) {
        super.setFood(food);
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getInfo() {
        return "Вид: кот" + '\n' +
                super.getInfo() +
                "Вес: " + this.getWeight() + '\n';
    }

    public void makeNoise() {
        System.out.println("Мяу!");
    }

    public void eat() {
        System.out.println("Кот ест " + this.getFood());
    }

    public void sleep() {
        System.out.println("Кот спит");
    }

}
