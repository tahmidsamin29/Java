package Problem3;

public class Problem3_4 {
    public static void main(String[] args) {
        int[] numbers = {12,3,5,6,25,300,23,456,32,34,67};
        int max=numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }

        System.out.print("Max: " + max);
    }
    
}
