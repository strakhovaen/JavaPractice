package homework1.tasks;

public class Task10PrimeNumber {
    public static void main(String[] args) {
        int number = 9;
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
}
