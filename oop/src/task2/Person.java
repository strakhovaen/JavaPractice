package task2;

public class Person {
    String fullName;
    int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("ФИО: " + this.fullName + ", возраст: " + this.age);
        System.out.println();
    }

    public void move() {
        System.out.println(this.fullName + " идёт");
        System.out.println();
    }

    public void talk() {
        System.out.println(this.fullName + " говорит");
        System.out.println();
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Иванов Иван Иванович";
        person1.age = 18;

        Person person2 = new Person("Сулима Дарья Васильевна",25);

        person1.displayInfo();
        person1.move();
        person1.talk();

        person2.displayInfo();
        person2.move();
        person2.talk();
    }
}
