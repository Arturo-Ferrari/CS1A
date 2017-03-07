//******************************************************
// Salary.java
// Compute the raise and new salary for an employee
//******************************************************
import java.util.Scanner;
public class Salary 
{
      public static void main(String[] args) 
      {
         double currentSalary; // current annual salary
         double rating; // performance rating
         double raise; // dollar amount of the raise
         Scanner scan = new Scanner(System.in); 
         // Get the current salary and performance rating
         System.out.print("Enter the current salary: ");
         currentSalary = scan.nextDouble();
         System.out.print("Enter the performance rating: ");
         rating = scan.nextDouble();         
         // Compute the raise -- Use if ... else ...
         if (rating == 1)
            raise = currentSalary*.06;
         else if (rating == 2)
            raise = currentSalary*.04;
         else
            raise = currentSalary*.015;
      // Print the results
         System.out.println("Amount of your raise: $" + raise);
         System.out.print("Your new salary: $" + (currentSalary + raise));
        }


}
