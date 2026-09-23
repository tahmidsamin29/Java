package Problem3;

import java.util.Scanner;

public class Problem3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int f=0;

        if(number==0 || number==1){
            System.out.println(number + " is a non-prime.");
        }
        else{
            for(int i=2; i*i<=number; i++){
                if(number%i==0){
                    System.out.println(number + " is a non-prime.");
                    f=1;
                    break;
                }
            }
            if(f==0){
                System.out.println(number + " is a prime.");
            }
        }

    }
}
