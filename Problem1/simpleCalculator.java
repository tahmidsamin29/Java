import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Enter operator: ");
        char o = scanner.next().charAt(0);

        int result=0;
        if(o=='+'){
            result = a+b;
        }
        if(o=='-'){
            result = a-b;
        }
        if(o=='*'){
            result = a*b;
        }
        if(o=='/'){
            result = a/b;
        }

        System.out.println("Result: "+result);



        scanner.close();

    }
}
