//11. Высчитывание определённого от a до b интеграла от sin(1/x)dx методом прямоугольников

package homework1.tasks;

import java.util.Scanner;

public class Task11DefiniteIntegral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number a: ");
        double a = in.nextInt();

        System.out.print("Input number b: ");
        double b = in.nextInt();

        System.out.print("Input number n (count of segments): ");
        int n = in.nextInt();

        in.close();

        double h = (b - a) / n;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += h * Math.sin(1/(a + i*h));
        }

        System.out.println("Result: " + sum);

    }
}
