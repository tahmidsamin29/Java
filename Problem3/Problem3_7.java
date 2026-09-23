package Problem3;

public class Problem3_7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int even_cnt=0;
        int odd_cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even_cnt++;
            }
            else{
                odd_cnt++;
            }
        }
        System.out.println("Number of even numbers: " + even_cnt);
        System.out.println("Number of odd numbers: " + odd_cnt);
    }
}
