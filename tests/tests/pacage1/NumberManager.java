package tests.pacage1;

import java.util.Scanner;

public class NumberManager {
    public static void toBinary(int decimalNumber) {
        int i = decimalNumber;
        int mod;
        String s = "";

        while (i > 0) {
            mod = i % 2;
            s = mod + s;
            i = i / 2;
        }

        System.out.println(decimalNumber + " in Binary System: " + s);
    }


    public static void isEvenNumber(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }


    public static void isPrimeNumber(int number) {
        boolean check = false;

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                check = true;
                break;
            }
        }

        if (!check) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }


    public static void numbersFromAToB(int a, int b) {
        System.out.print("Numbers from " + a + " to " + b + ": ");
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
            }

        System.out.println();
    }


    public static void integral(double a, double b, int n) {
        double h = (b - a) / n;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += h * Math.sin(1/(a + i*h));
        }

        System.out.printf("Integral from " + a + " to " + b + " with step " + h + ": " + sum);
        System.out.println();
    }


    public static void SumOfEvenNumbersBeforeMinusOne() { //(String [] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i = 0;

        System.out.println("Input numbers (stop at -1): ");
        while (i != -1) {
            i = in.nextInt();
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of all even numbers: " + sum);
    }


    public static void minAndMaxDifference() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input numbers (separated by space, stop with Enter): ");
        String numbersLine = in.nextLine();

        int min, max, numberInt;
        String numberStr;

        if (numbersLine.indexOf(" ") != -1) {
            numberStr = numbersLine.substring(0, numbersLine.indexOf(" "));
            min = Integer.parseInt(numberStr);
            max = min;
            numbersLine = numbersLine.substring(numberStr.length() + 1);
        } else {
            min = Integer.parseInt(numbersLine);
            max = min;
            numbersLine = "";
        }

        while (numbersLine != "") {
            if (numbersLine.indexOf(" ") == -1)
                numberStr = numbersLine;
            else
                numberStr = numbersLine.substring(0, numbersLine.indexOf(" "));

            numberInt = Integer.parseInt(numberStr);

            if (numberInt > max) max = numberInt;
            if (numberInt < min) min = numberInt;

            if (numberStr == numbersLine)
                numbersLine = "";
            else
                numbersLine = numbersLine.substring(numberStr.length() + 1);
        }

        int dif = max - min;

        System.out.println("Min and Max difference: " + dif);
    }


    //Среди введённых чисел посчитать произведение тех, сумма цифр которых - чётное число, и сумму тех, что оканчиваются на 7
    public static void sumAndProduct() {
        System.out.println("Input numbers (separated by space, stop with Enter): ");
        Scanner in = new Scanner(System.in);
        String numberString = in.nextLine();

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
            System.out.println("Product of numbers in which sum of digits is even number: No such numbers" );
        else
            System.out.println("Product of numbers in which sum of digits is even number: " + product);

        if (sumOfEndingWith7 ==0)
            System.out.println("Sum of numbers ended with 7: No such numbers" );
        else
            System.out.println("Sum of numbers ended with 7: " + sumOfEndingWith7);

    }

}
