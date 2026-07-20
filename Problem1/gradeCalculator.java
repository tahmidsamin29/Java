import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = scanner.nextInt();
        if(marks<=39 && marks>=0){
            System.out.println("Grade: F");
        }
        else if(marks>=40 && marks<=59){
            System.out.println("Grade: C+");
        }
        else if(marks>=60 && marks<=69){
            System.out.println("Grade: B");
        }
        else if(marks>=70 && marks<=79){
            System.out.println("Grade: A-");
        }
        else if(marks>=80 && marks<=89){
            System.out.println("Grade: A");
        }
        else if(marks>=90){
            System.out.println("Grade: A+");
        }
        else{
            System.out.println("Invalid");
        }

        scanner.close();
    }
}
