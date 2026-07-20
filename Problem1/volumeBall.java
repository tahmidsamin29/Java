import java.util.Scanner;

public class volumeBall {
    
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter Radius: ");
    double radius= scanner.nextDouble();
    double volume = (4.0/3)*Math.PI*Math.pow(radius, 3);
    System.out.println("Volume: "+ volume);


    scanner.close();
}

}
