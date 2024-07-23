//Student Grades

import java.util.Scanner;
public class Grades{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Please Enter Your Marks");  // Taking User Input
       int num1 = input.nextInt();
       System.out.println("Your Marks are "+num1);  // For A grade Student
       if (num1 > 90 || num1 == 100) {
           System.out.println("Your Grades are A");
           System.out.println("Excellent");
       }
       else if (num1 > 75 || num1 == 90){           // For B grade Student
           System.out.println("Your Grades are B");
           System.out.println("Good");
       }
       else if (num1 > 50 || num1 == 75){           // For C Garde Student
           System.out.println("Your Grades are C");
           System.out.println("Can do Better");
       }
       else if (num1 > 33 || num1 == 50){          // For D Grade Student
           System.out.println("Your Grades are D");
           System.out.println("Need to Better");
       }
       else{
           System.out.println("Sorry!! You are Fail");   // For Fail Students
       }


   }
}
