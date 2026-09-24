package Problem4;

class Wallet1{
private int balance;
final int ID;
static int count=0;

Wallet1(){
    count++;
    ID=count;
    this.balance=0;
}

Wallet1(int balance){
    count++;
    ID=count;
    this.balance=balance;
}

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

public class Problem4_3_3 {
    public static void main(String[] args) {
        Wallet1 w1 = new Wallet1(100);
        System.out.println(w1.ID);
    }
    
}
