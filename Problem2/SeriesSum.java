public class SeriesSum {
    public static void main(String[] args) {
        int s1=0;
        for(int i=2; i<=20; i+=2){
            s1=s1+i;
        }
        int s2=0;
        for(int i=1; i<=19; i+=2){
            s2=s2+i;
        }

        System.out.println("Sum of the 1st series: " + s1);
        System.out.println("Sum of the 2nd series: " + s2);

    }
}
