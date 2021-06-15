package tests.pacage1;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class NumberManagerTest {

    @Test
    public void main() {
    }

    @Test
    public void toBinary() {

    }

    @Test
    public void isEvenNumber() {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number a for tests: ");
        int a = in.nextInt();

        NumberManager.isEvenNumber(a);
    }

    @Test
    public void isPrimeNumber() {
    }

    @Test
    public void numbersFromAToB() {
    }

    @Test
    public void integral() {
    }

    @Test
    public void sumOfEvenNumbersBeforeMinusOne() {
    }

    @Test
    public void minAndMaxDifference() {
    }

    @Test
    public void sumAndProduct() {
    }
}