//02. Определение чётности числа

package homework1.tasks;

public class Task2EvenNumber {
   public static void main (String [] args) {
       int num = 8;

       if (num % 2 == 0) {
           System.out.println(num + " is even number");
       } else {
           System.out.println(num + " is odd number");
       }
    }
}
