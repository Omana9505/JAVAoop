import java.util.Scanner;

class Square{
    void square10(){
        System.out.println("Squares");
        for(int i=1;i<11;i++){
            System.out.println(i+"*"+i+"="+i*i);
        }
    }
}

class Cubes{
    void cubes10(){
        System.out.println("Cubes");
        for(int i=1;i<11;i++){
            System.out.println(i+"*"+i+"*"+i+"="+i*i*i);
        }
    }
}

public class square_cubes {
    public static void main(String [] args){
        Square s1 = new Square();
        s1.square10();

        Cubes c1 = new Cubes();
        c1.cubes10();
    }    
    
}
