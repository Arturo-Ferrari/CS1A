/*
 * Class: CS1A
 * Description: Calculates Bank service fees based on the number of checks written
 * Due date: February 8, 2017
 * Name: Arturo Ferrari Jr.
 * File name: BankCharges.java
 */
import java.util.Scanner;
public class BankCharges 
{
   public static void main(String [] args)
   {
      //Prompts and reads the number of checks written
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the total number of checks written this month: ");
      int totalChecks = scan.nextInt();
   
      //Calculates the bank service fees
      double serviceFees;
      if (totalChecks <= 0)
         serviceFees = 0;
      else if (totalChecks < 20)
         serviceFees = totalChecks*0.1;
      else if (totalChecks >= 20 && totalChecks < 39)
         serviceFees = totalChecks*0.08;
      else if (totalChecks >= 39 && totalChecks <  59)
         serviceFees = totalChecks*0.06;
      else
         serviceFees = totalChecks*0.04;
      
      //Prints the bank service fees
      System.out.print("The total fees are " + "$");
      System.out.printf("%.2f", serviceFees);
   }
}
/*
Enter the total number of checks written this month: 27
The total fees are $2.16
*/
