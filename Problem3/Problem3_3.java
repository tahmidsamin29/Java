package Problem3;

import java.util.Scanner;

public class Problem3_3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Percentage of target sales: ");
    int sales = scanner.nextInt();
    System.out.println("Attendance: ");
    int attendance = scanner.nextInt();
    double bonus=0.0;

    if(sales>=95 && attendance==100){
        System.out.println("Added Bonus of 60%");
        bonus=0.6;
    }
    else if(sales>=95 && attendance>=90){
        System.out.println("Added Bonus of 40%");
        bonus=0.4;
    }
    else if(sales>=85 && attendance==100){
        System.out.println("Added Bonus of 40%");
        bonus=0.4;
    }
    else if(sales>=80 && attendance==90){
        System.out.println("Added Bonus of 20%");
        bonus=0.2;
    }
    else{
        System.out.println("Added Bonus of 5%");
        bonus=0.05;
    }
    }
}
