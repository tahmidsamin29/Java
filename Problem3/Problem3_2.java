package Problem3;
import java.util.Scanner;

public class Problem3_2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter grade: ");
    double grade=scanner.nextDouble();
    int medal=0;


    if(grade>=3.5){
        System.out.println("Has the student completed the semester? Y/N");
        String query=scanner.next();
        if(query.equals("Y")){
            medal++;
                System.out.println("Medal has been given");
        }
        else{
            System.out.println("No medal has been given");
        }
    }
    else{
            System.out.println("No medal has been given");
        } 

}
}
