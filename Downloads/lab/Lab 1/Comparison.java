import java.util.Scanner;

class operations{
    int num1;
    int num2;

    operations(int a, int b){
        num1 = a;
        num2 = b;

        if(num1 > num2){
            System.out.print("First number is largest");
        }
        else if(num2 > num1){
            System.out.print("Second number is largest");
        }

        else{
            System.out.print("Numbers are Equal");
        }
    }

}

public class Comparison {
    
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        operations o1 = new operations(num1, num2);


    input.close();

    }
}
