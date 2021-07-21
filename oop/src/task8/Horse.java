package task8;

public class Horse extends Animal {
    private String allergy;

    public Horse() {
    }

    public Horse(String food, String location, String allergy) {
        super(food,location);
        this.allergy = allergy;
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    public String getAllergy() {
        return allergy;
    }

    @Override
    public void setFood(String food) {
        super.setFood(food);
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getInfo() {
        return "Вид: лошадь" + '\n' +
                super.getInfo() +
                "Аллергия: " + this.getAllergy() + '\n';
    }

    public void makeNoise() {
        System.out.println("Лошадь ржёт");
    }

    public void eat() {
        System.out.println("Лошадь ест " + this.getFood());
    }

    public void sleep() {
        System.out.println("Лошадь спит");
    }

}
