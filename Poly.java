
import java.util.Scanner;
class Vehicle{
    Vehicle(){
        System.out.printf("Vehicle\n\n");
    }
    void prf(){
        System.out.printf("\nthis is vehicle\n");
    }

}

class  Car extends Vehicle{
    void prf(){
        System.out.printf("\nthis is CAR\n");
    }
}

class Bike extends Vehicle{
    void prf(){
        System.out.print("\nThis is BIKE\n");
    }
}
public class Poly{
public static void main(String[] args){
    Vehicle v = new Car();
    v.prf();
    Vehicle v2 = new Bike();
    v2.prf();
} 
}
