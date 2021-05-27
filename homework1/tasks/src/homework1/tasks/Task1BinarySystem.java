//01. Перевод числа 67 в двоичную систему

package homework1.tasks;

import java.util.Scanner;

public class Task1BinarySystem { public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input a number: ");
    int DecimalNumber = in.nextInt();

    int i=DecimalNumber;
    int Div;
    int Mod;
    String s="";

    while (i>0)
    {
        Div=i/2;
        Mod=i%2;
        s=Mod+s;
        i=i/2;
    }

    System.out.println(DecimalNumber + " in Binary System: " + s);
}
}
