import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius= scanner.nextDouble();
        double area=Math.PI*Math.pow(radius, 2);
        System.out.println("Area: "+area);

        scanner.close();
    }
}
