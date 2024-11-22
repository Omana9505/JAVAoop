import java.util.Scanner;

public class SeperateNumbers {
    public static void main(String [] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
            int number = input.nextInt();

        while(number>0){
            int unit = number%10;
            System.out.print(unit + "   ");
            number = number/10;
        }
    }
}
