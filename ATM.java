import java.util.Scanner;


class bankaccount {
    private double balance;

    public bankaccount(double initial_balance){
        balance = initial_balance;
    }


    public void deposit(double deposit_amount){
        balance += deposit_amount;
        System.out.println("amount deposited sucessfully");
    }
    public void withdraw(double withdraw_amount){
        if (balance >=withdraw_amount){
            balance-=withdraw_amount;
            System.out.println("amount withdrawed sucessfully");
        }
        else
            System.out.println("insufficient balance");

    }
    public double checkBalance(){
        return balance;
    }   
}


 public class ATM{ 
    public static void main(String[] args) {
        bankaccount account1 = new bankaccount(1000.0);
        
        int choice =0;
        double amount;
        Scanner x = new Scanner(System.in);
        while (choice!=4) {
            System.out.println();
            System.out.print("Enter your choice 1)deposit amount 2)withdraw  amount 3)check balance 4)exit : ");
            choice = x.nextInt();

             switch(choice){
                case 1:
                    System.out.print("Enter amount to deposit:");
                    amount = x.nextDouble();
                    account1.deposit(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw:");
                    amount = x.nextDouble();
                    account1.withdraw(amount);
                    break;
                case 3:
                    System.out.print("current balance is :"+ account1.checkBalance());
                    break;
                case 4:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("invalid choice");    
                    break;
             }   
        }
        x.close();
        
    }     
    
}

