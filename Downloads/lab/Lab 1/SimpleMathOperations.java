import java.util.Scanner;

class Basics{

    void operations(int num1, int num2){
         // Calculate sum, product, difference, and quotient
         int sum = num1 + num2;
         int product = num1 * num2;
         int difference = num1 - num2;
         double quotient = 0;

         if (num2 != 0) {
             quotient = (double) num1 / num2;
         } else {
             System.out.println("Error: Division by zero is not allowed.");
         }

         // Display the results
         System.out.println("Sum: " + sum);
         System.out.println("Product: " + product);
         System.out.println("Difference: " + difference);
         if (num2 != 0) {
             System.out.println("Quotient: " + quotient);
         }

    }
}

public class SimpleMathOperations {

    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        Basics b1 = new Basics();
        b1.operations(num1, num2);
       

        // Close the scanner
        input.close();
    }
}
