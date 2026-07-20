import java.util.Scanner;

public class areaUsingSemiPerimeterTriangle {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of 1st side: ");
        double l1=scanner.nextDouble();
        System.out.println("Enter length of 2nd side: ");
        double l2=scanner.nextDouble();
        System.out.println("Enter length of 3rd side: ");
        double l3=scanner.nextDouble();

        double s= (l1+l2+l3)/2;
        double area= Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));

        System.out.println("Area: "+area);

        scanner.close();
    }
}
