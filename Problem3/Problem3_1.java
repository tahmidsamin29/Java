package Problem3;

public class Problem3_1{
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            sum+=numbers[i];
        }
        int avg=sum/numbers.length;
        System.out.print("Average of 1, 2, 3, 4, 5 is " + avg);
    }
}