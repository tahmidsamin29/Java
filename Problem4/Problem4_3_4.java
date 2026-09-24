package Problem4;

class Wallet2{
private double balance;
final int ID;
static int count=0;
String withdrawMode;

Wallet2(){
    count++;
    ID=count;
    this.balance=0;
}

Wallet2(double balance){
    count++;
    ID=count;
    this.balance=balance;
}

void deposit(double amount){
this.balance=balance+amount;
System.out.println(amount + " has been deposited to wallet.");
System.out.println("Current balance: " + this.balance);
}
void withdraw(double amount){
    if(amount>this.balance){
    System.out.println("Insufficient funds");
    }
    else{
    this.balance=balance-amount;
    System.out.println(amount + " has been withdrawn from wallet.");
    System.out.println("Current balance: " + this.balance);
    }
}

void withdraw(double amount, String mode){
    if(amount>this.balance){
    System.out.println("Insufficient funds");
    }
    else{
    this.balance=balance-amount;
    withdrawMode=mode;
    System.out.println(amount + " has been withdrawn from wallet.");
    System.out.println("Current balance: " + this.balance);
    System.out.println("Current withdraw mode: " + withdrawMode);
    }
}
}

public class Problem4_3_4 {
    public static void main(String[] args) {
        Wallet2 w1 = new Wallet2(200.0);
        w1.withdraw(100.0, "ATM");    
    }
}
