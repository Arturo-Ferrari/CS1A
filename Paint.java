//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//*************************************************************** 
import java.util.Scanner;
public class Paint
{
   public static void main(String[] args)
   {
      final int COVERAGE = 350; //paint covers 350 sq ft/gal
      int length, width, height; //declare integers length, width, and height
      double totalSqFt; //declare double totalSqFt
      double paintNeeded; //declare double paintNeeded
      Scanner scan = new Scanner(System.in); //declare and initialize Scanner object
      System.out.print("Enter the length of the room: "); //Prompt for and read in the length of the room
      length = scan.nextInt();
      System.out.print("Enter the width of the room: "); //Prompt for and read in the width of the room
      width = scan.nextInt();
      System.out.print("Enter the height of the room: "); //Prompt for and read in the height of the room
      height = scan.nextInt();
      totalSqFt = 2 * width * height + 2 * length * height; //Compute the total square feet to be painted
      paintNeeded = totalSqFt / COVERAGE; //Compute the amount of paint needed
      System.out.print(paintNeeded + " gallons of paint are needed to paint a room "); //Print the length, width, and height of the room and the number of gallons of paint needed.
      System.out.println(width + " feet wide by ");
      System.out.print(length + " feet long by " + height + " feet high.");
      System.out.println();
      scan.close();
   }
}

