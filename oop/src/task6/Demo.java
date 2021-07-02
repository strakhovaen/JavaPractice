package task6;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Панько", "И121", 4);
        Aspirant aspirant1 = new Aspirant("Роман", "Романов", "М01", 4.5, "Интегралы и почему мы их изучаем");
        Student aspirant2 = new Aspirant("Зинаида", "Кукурузова", "И03", 5, "Поработят ли нас компьютеры?");
        Student aspirant3 = new Aspirant("Борис", "Кукурузов", "Э01", 3, "Какая-то экономическая муть");

        Student[] people = {student1, aspirant1, aspirant2, aspirant3};

        for (Student s: people) {
            System.out.print(s.firstName + " " + s.lastName + ": ");
            System.out.println(s.getScholarship());
        }
    }
}
