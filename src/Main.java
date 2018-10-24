import java.util.*;

/* 
    Fibonacci and Factorial Calculator
    (1) Loops
    (2) Functions/Methods
    (3) Recursion - Not part of 1310 but an integral part to programming in genral
    (4) Switch Case

    Factorial: 1,1,2,6,24,120 etc
    Fibonacci: 1,1,2,3,5,8,13 etc

*/

public class Main {
    public static void printMenu() {
        System.out.println("Choose your option");
        System.out.println("(1) Fibonacci Value");
        System.out.println("(2) Factorial Value");
        System.out.println("(3) Exit");
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int factorial (int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {

        int choice = 0;
        Scanner input = new Scanner(System.in);

        while(choice == 0) {
            printMenu();
            System.out.print("Enter a choice: ");
            choice = input.nextInt();
            int num = 0;

            System.out.println();

            switch(choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    num = input.nextInt();
                    System.out.println("Fibonacci value is: " + fibonacci(num));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    num = input.nextInt();
                    System.out.println("Factorial value is: " + factorial(num));
                    break;
                case 3:
                    System.out.println("Exiting....");
                    choice = 0;
                    break;
            }
        }
    }
}

