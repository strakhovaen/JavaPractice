package task10.oop2;

import task10.oop1.ParentClass;

public class NewClass extends ParentClass {

    public static void main(String[] args) {
        ParentClass testNew = new NewClass();

        testNew.publicVar = 0;
        //testNew.privateVar = 1; //нет доступа
        //testNew.defaultVar = 2; //нет доступа
        //testNew.protectedVar = 3; //нет доступа - ПОЧЕМУ??


        testNew.publicMethod();
        //testNew.privateMethod(); //нет доступа
        //testNew.defaultMethod(); //нет доступа
        //testNew.protectedMethod(); //нет доступа - ПОЧЕМУ??

    }

}
