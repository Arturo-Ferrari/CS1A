/*
 * Class: CS1A
 * Description: Generates a user name based on the user's full name
 * Due date: February 8, 2017
 * Name: Arturo Ferrari Jr.
 * File name: UserNameGenerator.java
 */
import java.util.Random;
import java.util.Scanner;
public class UserNameGenerator 
{
   public static void main(String [] args)
   {
      //Prompts and reads the user's full name
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your first name: ");
      String firstName = scan.nextLine();
      System.out.println("Enter your last name: ");
      String lastName = scan.nextLine();
         
      //Finds the first letter of the user's first name
      String firstLetter = firstName.substring(0,1);
         
      //Finds the first five letters of the user's last name
      String lastNameFive = lastName.substring(0,5);
         
      //Generates a random number
      Random generator = new Random();
      int randomNumber;
      randomNumber = generator.nextInt(93) + 9;
         
      //Concatenates and prints the username
      String userName = firstLetter + lastNameFive + randomNumber;
      System.out.println("Username: " + userName);    
    }
}
/*
Enter your first name: 
Arturo
Enter your last name: 
Ferrari
Username: AFerra14
*/