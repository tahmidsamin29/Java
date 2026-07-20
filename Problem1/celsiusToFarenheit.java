import java.util.Scanner;

public class celsiusToFarenheit {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Celsius: ");
        double celsius= scanner.nextDouble();
        double farenheit= ((celsius/5)*9)+32;
        System.out.println("Farenheit: "+farenheit);

        scanner.close();
    }
}
