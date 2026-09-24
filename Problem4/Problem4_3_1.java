package Problem4;


public class Problem4_3_1 {
    
    static int deposit(int balance, int amount){
        return balance+amount;
    }
    static int withdraw(int balance, int amount){
        if(amount>balance){
            System.out.println("Insufficient funds!");
            return balance;
        }
        else{
        return balance-amount;}
    }
    public static void main(String[] args) {
        int balance_1=500;
        int balance_2=100;

        System.out.println("Balance before depositing for 1st wallet: " + balance_1);
        balance_1=deposit(balance_1, 100);
        System.out.println("Balance after depositing for 1st wallet: " + balance_1);
        
        System.out.println("Balance after depositing for 2nd wallet: " + balance_2);
        balance_2=deposit(balance_2, 100);
        System.out.println("Balance before depositing for 2nd wallet: " + balance_2);

        System.out.println("Balance before withdrawing for 1st wallet: " + balance_1);
        balance_1=withdraw(balance_1, 200);
        System.out.println("Balance after withdrawing for 1st wallet: " + balance_1);

        System.out.println("Balance before withdrawing for 2nd wallet: " + balance_2);
        balance_2=withdraw(balance_2, 100);
        System.out.println("Balance after withdrawing for 2nd wallet: " + balance_2);

        

    }
}
