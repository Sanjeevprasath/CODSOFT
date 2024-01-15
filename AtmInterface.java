import java.util.*;
class Atm{
    long acc_no;
    float amount;
    String name;
   void details(long an,float amnt,String n){
   acc_no=an;
   amount=amnt;
   name=n;
 }
void deposit(float amnt){
    amount+=amnt;
    System.out.println("DEPOSITED AMOUNT Rs."+amnt);
}
void withdraw(float amnt){
    if(amount<amnt){
        System.out.println("Transaction failed Insufficient balance !!!");
    }
    else{
        amount=amount-amnt;
        System.out.println("WITHDRAWN AMOUNT Rs."+amnt);
    }
}
void checkbalance(){
        System.out.println("Your account balance is Rs."+amount);
}
void display(){
    System.out.println("ACCOUNT_NUMBER:"+acc_no);
    System.out.println("PERSON_NAME:"+name);
 }
}
public class AtmInterface{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your four digit PIN number:");
        int PIN=s.nextInt();
        Atm n=new Atm();
        n.details(1015203241558L,26000,"RAJA");
        n.display();
        System.out.println("To Deposit amount enter:1");
        System.out.println("To Withdraw amount enter:2");
        System.out.println("To check balace enter:3");
        
    
        System.out.print("Choose your option:");
        int choice=s.nextInt();
        float amnt;
        if(choice==1){
        System.out.print("Enter the Amount to Deposit:");
        amnt=s.nextInt();
        n.deposit(amnt);
        System.out.print("After Depositing ");
        n.checkbalance();
        }
        else if(choice==2){
        System.out.print("Enter the Amount to Withdraw:");
        amnt=s.nextInt();
        n.withdraw(amnt);
        System.out.print("After Withdrwal ");
        n.checkbalance();
        }
        else if(choice==3){
        n.checkbalance();
        }
        else{
            System.out.println("No choice exist!!!");
        }
    }
}