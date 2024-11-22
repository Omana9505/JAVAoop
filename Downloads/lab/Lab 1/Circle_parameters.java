import java.util.Scanner;

class Circle{

    void calculations(int radius){
        System.out.println("Diameter is " + (2*radius));
        System.out.println("Circumference is " + (2*3.14*radius));
        System.out.println("Area is " + (3.14*radius*radius));
    }
}

public class Circle_parameters {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
            int radius = input.nextInt();

        Circle c1 = new Circle();
        c1.calculations(radius);


    input.close();
    }
}
