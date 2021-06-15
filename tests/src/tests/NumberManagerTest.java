package tests;

import org.junit.Assert;
import org.junit.Test;
import utils.NumberManager;

import java.util.Scanner;

public class NumberManagerTest {

    @Test
    public void main() {
    }

    @Test
    public void toBinary() {
        int a = 13;
        String resultA = NumberManager.toBinary(a);

        int b = 0;
        String resultB = NumberManager.toBinary(b);

        int c = 100;
        String resultC = NumberManager.toBinary(c);

        String expectedA = "1101";
        Assert.assertEquals(resultA,expectedA);

        String expectedB = "0";
        Assert.assertEquals(resultB,expectedB);

        String expectedC = "1100100";
        Assert.assertEquals(resultC,expectedC);
    }

    @Test
    public void isEvenNumber() {
        int a = 7;
        String resultA = NumberManager.isEvenNumber(a);

        int b = 100;
        String resultB = NumberManager.isEvenNumber(b);

        String expectedA = "odd number";
        Assert.assertEquals(resultA,expectedA);

        String expectedB = "even number";
        Assert.assertEquals(resultB,expectedB);
    }

    @Test
    public void isPrimeNumber() {
        int a = 1;
        String resultA = NumberManager.isPrimeNumber(a);

        int b = 5;
        String resultB = NumberManager.isPrimeNumber(b);

        int c = 15;
        String resultC = NumberManager.isPrimeNumber(c);

        String expectedA = "prime number";
        Assert.assertEquals(resultA,expectedA);

        String expectedB = "prime number";
        Assert.assertEquals(resultB,expectedB);

        String expectedC = "not prime number";
        Assert.assertEquals(resultC,expectedC);
    }

    @Test
    public void numbersFromAToB() {
        int a = 5;
        int b = 10;
        String resultA = NumberManager.numbersFromAToB(a,b);

        String expectedA = "5 6 7 8 9 10";
        Assert.assertEquals(resultA,expectedA);
    }

    @Test
    public void integral() {
        int a = 1;
        int b = 3;
        int n = 10000;

        double result = NumberManager.integral(a,b,n);

      //  float expected = ;
      //  Assert.assertEquals(actual,expected);
    }


    @Test
    public void minAndMaxDifference() {
        String numbersLine1 = "10 3 0 -7 13 5";
        System.out.println(numbersLine1);
        int dif1 = NumberManager.minAndMaxDifference(numbersLine1);

        String numbersLine2 = "0 2 8 60 100 1 0";
        System.out.println(numbersLine2);
        int dif2 = NumberManager.minAndMaxDifference(numbersLine2);

        int expected1 = 20;
        Assert.assertEquals(dif1,expected1);

        int expected2 = 100;
        Assert.assertEquals(dif2,expected2);
    }

    @Test
    public void sumAndProduct() {


    }
}