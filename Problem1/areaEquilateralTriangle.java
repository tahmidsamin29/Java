import java.util.Scanner;

public class areaEquilateralTriangle {
    
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    System.out.println("Enter length: ");
    double length= scanner.nextDouble();
    double area= (Math.sqrt(3)/4)*Math.pow(length, 2);
    System.out.println("Area: "+ area);

    scanner.close();
} }
