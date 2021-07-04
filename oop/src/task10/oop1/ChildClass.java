package task10.oop1;

public class ChildClass extends ParentClass {

    public static void main(String[] args) {
        ParentClass test = new ChildClass();

        //test.privateVar = 0; //нет доступа
        test.publicVar = 1;
        test.protectedVar = 2;
        test.defaultVar = 3;

        test.publicMethod();
        //test.privateMethod(); //нет доступа
        test.defaultMethod();
        test.protectedMethod();
    }

}
