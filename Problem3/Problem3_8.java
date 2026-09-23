package Problem3;

public class Problem3_8 {

    static int fibonacci(int n){

        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        else{
            return fibonacci(n-1) + fibonacci(n-2); 
        }
   
    }

    public static void main(String[] args) {

        for(int i=0; i<12; i++){
            int r=fibonacci(i);
            System.out.print(r+" ");
        }
        
    }
}
