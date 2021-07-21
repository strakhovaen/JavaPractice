package task2;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
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
        person1.setFullName("Иванов Иван Иванович");
        person1.setAge(18);

        Person person2 = new Person("Сулима Дарья Васильевна",25);

        person1.displayInfo();
        person1.move();
        person1.talk();

        person2.displayInfo();
        person2.move();
        person2.talk();
    }
}
