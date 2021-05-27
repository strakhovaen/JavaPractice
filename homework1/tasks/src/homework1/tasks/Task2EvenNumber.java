//02. Определение чётности числа

package homework1.tasks;

import java.util.Scanner;

public class Task2EvenNumber {
   public static void main (String [] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Input a number: ");
       int Num = in.nextInt();
       if ( Num % 2 == 0) {System.out.println("Even number");}
       else {System.out.println("Odd number");}
    }
}
