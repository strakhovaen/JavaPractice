//04. Вывести сумму всех чётных чисел, введённых пользователем (пока не введёт -1)

package homework1.tasks;

import java.util.Scanner;

public class Task4SumOfAllEvenNumbers {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int[] Array = new int[50];
        int Sum=0;
        System.out.println("Input numbers: ");
        int n = in.nextInt();
        int i=0;
        while (n!=-1) {
            Array[i]=n;
            if (n%2==0) {Sum=Sum+n;}
            n = in.nextInt();
            i++;
        };

        System.out.print("Sum of even numbers:" + Sum);
    }
}
