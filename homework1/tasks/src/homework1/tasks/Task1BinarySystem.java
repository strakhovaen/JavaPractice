//01. Перевод числа 67 в двоичную систему

package homework1.tasks;

public class Task1BinarySystem {
    public static void main(String[] args) {
    int decimalNumber = 13;
    int i = decimalNumber;
    int div, mod;
    String s = "";

    while (i > 0) {
        div = i / 2;
        mod = i % 2;
        s = mod + s;
        i = i / 2;
    }

    System.out.println(decimalNumber + " in Binary System: " + s);
    }
}
