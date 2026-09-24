package Problem4;

class Wallet{
private int balance;

void deposit(int amount){
this.balance=balance+amount;
System.out.println(amount + " has been deposited to wallet.");
System.out.println("Current balance: " + this.balance);
}
void withdraw(int amount){
    if(amount>this.balance){
        System.out.println("Insufficient funds");
    }
    else{
    this.balance=balance-amount;
    System.out.println(amount + " has been withdrawn from wallet.");
    System.out.println("Current balance: " + this.balance);
    }
}
}

public class Problem4_3_2 {
    public static void main(String[] args) {
        Wallet w1 = new Wallet();
        w1.deposit(100);
        w1.deposit(200);
        w1.withdraw(1000);
        
    }
    
}
