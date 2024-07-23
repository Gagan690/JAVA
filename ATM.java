// ATM

import java.util.Scanner;

public class ATM{
    public static void main(String[] args){
        System.out.println("Please Enter your Choice ");
        System.out.println("Welcome to Our ATM");
        System.out.println("1.Check Your Balance");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Exit");
        Scanner input = new Scanner(System.in);  // For User Input
        int choice = input.nextInt();
        int fund = 10000;   // Current Balance as an Example

        // Check Balance
        if (choice==1){
            System.out.println("Your Current Balance is "+ fund);
        }
        // To add Money in the Balance
        else if (choice==2){
            System.out.println("Enter Amount ");
            int deposit = input.nextInt();
            System.out.println("Added Amount "+deposit);
            fund += deposit;
            System.out.println("Now Your Current Balance is "+fund);
        }
        // TO Withdraw Money
        else if (choice==3){
            System.out.println("Enter Amount ");
            int withdraw = input.nextInt();
            System.out.println("Withdraw Amount "+withdraw);
            if(withdraw>0 || withdraw<= fund) {
                fund -= withdraw;
                System.out.println("Now your Current Balance is " + fund);
            }else System.out.println("InValid Input");

        }
        // To Exit
        else if (choice==4){
            System.out.println("Thank You For Using Our ATM!!!");
        }
    }
}