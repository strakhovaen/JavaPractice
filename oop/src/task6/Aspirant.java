package task6;

public class Aspirant extends Student {
    String scienceWork;

    public Aspirant (String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    @Override
    public int getScholarship() {
        return averageMark == 5 ? 200 : 180;
    }

}
