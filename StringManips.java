// ***************************************************************
// StringManips.java
// Test several methods for manipulating String objects
// *************************************************************** 
import java.util.Scanner;
public class StringManips
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String phrase = new String ("This is a String test.");
      int phraseLength; // number of characters in the phrase String 
      int middleIndex; // index of the middle character in the String
      String firstHalf; // first half of the phrase String
      String secondHalf; // second half of the phrase String
      String middle3 = phrase.substring(9,13); //assigned to the middle three characters of the phrase string
     
      // compute the length and middle index of the phrase 
      phraseLength = phrase.length(); 
      middleIndex = phraseLength / 2;

      // get the substring for each half of the phrase 
      firstHalf = phrase.substring(0,middleIndex);
      secondHalf = phrase.substring(middleIndex, phraseLength);
      // concatenate the firstHalf at the end of the secondHalf 
      String switchedPhrase = secondHalf.concat(firstHalf);

      //print information about the phrase
      System.out.println();
      System.out.println ("Original phrase: " + phrase);
      System.out.println ("Length of the phrase: " + phraseLength + " characters");
      System.out.println ("Index of the middle: " + middleIndex);
      System.out.println ("Character at the middle index: " + phrase.charAt(middleIndex));
      System.out.println ("Middle three characters: " + middle3);
      
      //reads user's hometown city and state and prints the specified new string
      System.out.println ("Enter your homewtown city: ");
      String city = scan.nextLine(); //city is assigned to what the user inputs
      System.out.println("Enter your hometown state: ");
      String state = scan.nextLine(); //state is assigned to what the user inputs
      System.out.print(state.toUpperCase());
      System.out.print(" " + city + " ");
      System.out.println(state.toUpperCase());
      System.out.println();
   }
}