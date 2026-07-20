import java.util.Scanner;

public class areaTriangle{
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Base: ");
        double base = scanner.nextDouble();
        System.out.println("Enter Height: ");
        double height = scanner.nextDouble();

        double area= 0.5*base*height;

        System.out.println("Area: "+area);

        scanner.close();
    }
}