package sheet_1;

import java.util.Scanner;

class Diameter {
    Diameter(int r) {
        System.out.println("Diameter is: " + 2 * r);
    }
}

class Circumference {
    Circumference(int r) {
        System.out.println("Circumference is: " + 2 * Math.PI * r);
    }
}

class Area {
    Area(int r) {
        System.out.println("Area is: " + Math.PI * r * r);
    }
}

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();
        
        Diameter d = new Diameter(r);
        Circumference c = new Circumference(r);
        Area a = new Area(r);
        
        sc.close();
    }
}
