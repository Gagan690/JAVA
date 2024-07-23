//Calculator


import java.util.Scanner;

public class Calculator{
   public static void main(String[] args){
       System.out.println("Choose the option to calculate"); // Taking User Input and giving Choices
       System.out.println("1.ADD");
       System.out.println("2.SUBTRACT");
       System.out.println("3.MULTIPLE");
       System.out.println("4.DIVIDE");

       Scanner input = new Scanner(System.in);  // Taking Input
       int choice = input.nextInt();

       System.out.println("Enter the First Digit");  // First Input Number 
       int num1 = input.nextInt();

       System.out.println("Enter the Second Digit");  // Second Input Number
       int num2 = input.nextInt();

       if (choice==1){
           System.out.println("Your Answer is "+(num1+num2));  // For Adding Numbers
       }
       else if (choice==2){
           System.out.println("Your Answer is "+(num1-num2));   // For Subtracting Numbers
       }
       else if (choice==3){
           System.out.println("Your Answer is "+(num1*num2));   // For Multiping Numbers
       }
       else if (choice==4 || num2 !=0){
           System.out.println("Your Answer is "+(num1/num2));   // For Dividing Numbers
       }
       else{
           System.out.println("Invalid Input");
       }


   }
}