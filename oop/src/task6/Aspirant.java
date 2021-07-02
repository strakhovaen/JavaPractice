package task6;

public class Aspirant extends Student {
    String scienceWork;

    public Aspirant (String firstName, String lastName, String group, double averageMark, String scienceWork) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
        this.scienceWork = scienceWork;
    }

    @Override
    public int getScholarship() {
        return averageMark == 5 ? 200 : 180;
    }

}
