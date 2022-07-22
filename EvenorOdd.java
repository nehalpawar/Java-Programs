// Java Program to check whether the Number is Even or Not:
import java.util.Scanner;

public class EvenorOdd {
    public static void main(String args[]) {
        System.out.println("Java Program to check whether the number is Even or Odd");

        int number;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Integer Number to check:");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number);
            System.out.println("The Entered Number is a Even Number");
        }

        else {
            System.out.println(number);
            System.out.println("The Entered Number is Odd Number");
        }

    }

}
