//03. Вывести все целые числа в отрезке [a, b] (a и b вводятся юзером)

package homework1.tasks;

import java.util.Scanner;

public class Task3NumbersFromAToB {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number a: ");
        int a = in.nextInt();

        System.out.print("Input number b: ");
        int b = in.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }

        in.close();
    }
}
