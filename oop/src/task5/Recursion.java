package task5;

public class Recursion {
      public static String numbersFromAtoB (int a, int b) {
        String result = "";
        if (a == b) {
            return String.valueOf(b);
        } else if (a < b) {
            result = numbersFromAtoB(a, b - 1) + " " + b;
        } else if (a > b) {
            result = a + " " + numbersFromAtoB(a - 1, b);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numbersFromAtoB(1,5));
        System.out.println(numbersFromAtoB(10,0));

    }
}
