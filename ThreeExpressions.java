/*
 * Class: CS 1A
 * Description: Calculates expressions and prints them to console
 * Due Date: January 25, 2017
 * Name: Arturo Ferrari Jr.
 * File name: ThreeExpressions.java
 */
public class ThreeExpressions 
{
   public static void main(String [] args)
   {
      int myID, numLet;
      myID = 2296728;
      numLet = 7;
      System.out.println("My name is Arturo.");
      System.out.println("My student ID number is " + myID + ".");
      System.out.println("Arturo has " + numLet + " characters.");
      System.out.println("#1 --> " + (myID % 17));
      System.out.println("#2 --> " + ((numLet + 17) % 11));
      System.out.println("#3 --> " + ((double) myID/(numLet + 800)));     
   }
}
/*
My name is Arturo.
My student ID number is 2296728.
Arturo has 7 characters.
#1 --> 11
#2 --> 2
#3 --> 2846.007434944238
*/