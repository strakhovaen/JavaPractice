//04. Вывести сумму всех чётных чисел, введённых пользователем (пока не введёт -1)
//не с помощью массива

package homework1.tasks;

import java.util.Scanner;

public class Task4SumOfAllEvenNumbersWithoutArray {
    public static void main(String [] args) {
        int sum = 0;
        int i = 0;
        System.out.println("Input numbers: ");
        while (i != -1) {
            i = new Scanner(System.in).nextInt();
            if (i % 2 == 0) {sum = sum + i;}
        }

        System.out.println("Sum of all even numbers: " + sum);
    }
}
