package task10.oop1;

public class ParentClass {
    public int publicVar;
    private int privateVar;
    protected int protectedVar;
    int defaultVar;

    public void publicMethod() {
    }

    private void privateMethod() {
    }

    protected void protectedMethod() {
    }

    void defaultMethod() {
    }

    public static void main(String[] args) {
        ParentClass test1 = new ParentClass();

        test1.publicVar = 1;
        test1.privateVar = 2;
        test1.protectedVar = 3;
        test1.defaultVar = 4;

        test1.publicMethod();
        test1.privateMethod();
        test1.defaultMethod();
        test1.protectedMethod();

    }
}

class OneMoreClass {

    public static void main(String[] args) {
        ParentClass test2 = new ParentClass();

        test2.publicVar = 1;
        //test2.privateVar = 2; //нет доступа
        test2.protectedVar = 3;
        test2.defaultVar = 4;

        test2.publicMethod();
        //test2.privateMethod(); //нет доступа
        test2.defaultMethod();
        test2.protectedMethod();
    }
}
