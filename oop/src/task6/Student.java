package task6;

public class Student {
    String firstName, lastName, group;
    double averageMark;

    public Student () {

    }

    public Student (String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }

}

