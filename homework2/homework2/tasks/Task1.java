//01. Среди введённых чисел посчитать произведение тех, сумма цифр которых - чётное число, и сумму тех, что оканчиваются на 7

package homework2.tasks;

import java.net.SocketOption;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Input numbers: ");
        Scanner in = new Scanner(System.in);
        String numberString = in.nextLine();
        in.close();

        String number;
        int product = 1;
        int sumOfEndingWith7 = 0;
        int sumOfDigits;

        while (numberString != "") {
            if (numberString.indexOf(" ") == -1)
                number = numberString;
            else
                number = numberString.substring(0, numberString.indexOf(" "));

            sumOfDigits = 0;

            for (int j = 0; j < number.length(); j++) {
                sumOfDigits += Character.getNumericValue(number.charAt(j));
            }

            if (sumOfDigits % 2 == 0)
                product = product * Integer.parseInt(number);

            if (Character.getNumericValue(number.charAt(number.length()-1)) == 7)
                sumOfEndingWith7 += Integer.parseInt(number);

            if (number == numberString)
                numberString = "";
            else
                numberString = numberString.substring(number.length() + 1);
            }

        if (product == 1 )
            System.out.println("Product: No such numbers" );
        else
            System.out.println("Product:" + product);

        if (sumOfEndingWith7 ==0)
            System.out.println("Sum: No such numbers" );
        else
            System.out.println("Sum:" + sumOfEndingWith7);
    }
}
