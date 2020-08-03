
package app;

public class Account {
String AccNo;
int balance;
    
public Account(){
    AccNo = "Acc01";
    balance = 100;
}
public Account(String acc, int bal){
    this.AccNo = acc;
    this.balance = bal;
}
public void deposit(int amt){
    if(amt>100){
        balance += amt;
        System.out.println("giao dich hanh cong");
    } else if(amt<=100 && amt >0){
    System.out.println("so tien gui phai lon hon 100");
}
    else{
        System.out.println("khong the gui tien am");
    }
}
public void withdraw(int amt){
    if(amt >100 && amt < balance){
       
        System.out.println("Ban giao dich thanh cong");
        System.out.println("so du con lai la:"+ (balance - amt));
         balance -=amt;
    }
    else{
        System.out.println("Giao dich that bai");
    }
    }
    public int getBalance(){
        return this.balance;
    }
    @Override
public String toString(){
    return String.format("%s: %d",AccNo,balance);
}
}
