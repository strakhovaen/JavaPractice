package tests.pacage1;

import java.util.Scanner;

public class ExampleForNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number a for tests: ");
        int a = in.nextInt();

        NumberManager.isEvenNumber(a);

        NumberManager.isPrimeNumber(a);

        NumberManager.toBinary(a);

        System.out.print("Input number b for tests: ");
        int b = in.nextInt();

        NumberManager.numbersFromAToB(a,b);

        System.out.print("Input number n (>=1000) for tests: ");
        int n = in.nextInt();

        NumberManager.integral(a,b,n);

        NumberManager.SumOfEvenNumbersBeforeMinusOne();

        NumberManager.minAndMaxDifference();

        NumberManager.sumAndProduct();

        in.close();

    }
}