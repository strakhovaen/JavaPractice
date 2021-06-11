//01. Среди введённых чисел посчитать произведение тех, сумма цифр которых - чётное число, и сумму тех, что оканчиваются на 7

package homework2.tasks;

public class Task1 {
    public static void main(String[] args) {
        int[] array = ArrayManager.init();

        String number;
        int product = 1;
        int sumOfEndingWith7 = 0;
        int sumOfDigits;

        for (int i = 0; i < array.length; i++) {
            sumOfDigits = 0;

            number = Integer.toString(array[i]);

            for (int j = 0; j < number.length(); j++) {
                sumOfDigits += Character.getNumericValue(number.charAt(j));
            }

            if (sumOfDigits % 2 == 0)
                product = product * Integer.parseInt(number);

            if (Character.getNumericValue(number.charAt(number.length()-1)) == 7)
                sumOfEndingWith7 += Integer.parseInt(number);

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
