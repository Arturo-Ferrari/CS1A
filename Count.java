// ************************************************************
// Count.java
//
// This program reads in strings (phrases) and counts the
// number of blank characters and certain other letters
// in the phrase.
// ************************************************************
import java.util.Scanner;
public class Count {
   public static void main(String[] args) {
       String phrase; // a string of characters
       int countBlank; // the number of blanks (spaces) in the phrase
       int length; // the length of the phrase
       int countA, countE, countS, countT; // As, Es, Ss, and Ts in the phrase
       char ch; // an individual character in the string
       Scanner scan = new Scanner(System.in);

       // Print a program header
       System.out.println();
       System.out.println("Character Counter");
       System.out.println();

       // Read in a string and find its length
       System.out.print("Enter a sentence or phrase: ");
       phrase = scan.nextLine();
       length = phrase.length();
       
       // Initialize counts
       countBlank = 0;
       countA = 0;
       countE = 0;
       countS = 0;
       countT = 0;
       
       // a for loop to go through the string character by character
       // and count the blank spaces
       int i;
       for (i = 0;i < length;i++)
       {
          ch = phrase.charAt(i);
          switch (ch)
          {
             case ' ':
                countBlank++;
                break;
             case 'A':
             case 'a':
                countA++;
                break;
             case 'E':
             case 'e':
                countE++;
                break;
             case 'S':
             case 's':
                countS++;
                break;
             case 'T':
             case 't':
                countT++;
                break;
          } 
       }

       // Print the results
       System.out.println();
       System.out.println("Number of blank spaces: " + countBlank);
       System.out.println("Number of As: " + countA);
       System.out.println("Number of Es: " + countE);
       System.out.println("Number of Ss: " + countS);
       System.out.print("Number of Ts: " + countT);
   }
}