/*
 * Class: CS1A
 * Description: A text processing program that uses a key character and target string
 * Due Date: February 22, 2017 (Late: turned in February 25, 2017)
 * Name: Arturo Ferrari Jr.
 * File name: TextProcessing.java
 */
import java.util.Scanner;
public class TextProcessing 
{
   public static void main(String [] args)
   {
      //Variables that store method return values
      int keyCount;
      char getKeyChar;
      String getString, maskChar, removedKeyChar;
      
      //Gets key character and target string from the user
      getKeyChar = getKeyCharacter();
      getString = getString();
      
      //Prints the masked character string, removed character string, and key character count
      maskChar = maskChar(getString, getKeyChar);
      System.out.println(maskChar);       
      removedKeyChar = removedKeyChar(getString, getKeyChar);
      System.out.println(removedKeyChar);
      keyCount = keyCount(getString, getKeyChar);
      System.out.println(keyCount);
   }
   
   //Returns key character char value to the main method
   public static char getKeyCharacter()
   {
      
      //Prompts and reads the key character in String
      final int MINIMUM_LENGTH = 0, MAXIMUM_LENGTH = 1;
      Scanner key = new Scanner(System.in);
      System.out.print("Please enter a single character to act as a key: ");
      String fh = key.nextLine();
      
      //Checks for key character length and loops for proper input
      while (fh.length() == MINIMUM_LENGTH|| fh.length() > MAXIMUM_LENGTH)
      {	
         System.out.print("Please enter a single character to act as a key: ");
         fh = key.nextLine();
      }
     
      //Converts String to char
      char gKC = fh.charAt(0);
      return gKC;
   }
   
   //Returns target string as String to the main method
   public static String getString()
   {
      
      //Prompts and reads the target string
      final int MINIMUM_SIZE = 4, MAXIMUM_SIZE = 500;
      Scanner read = new Scanner(System.in);
      String targetString = " ";
      System.out.println("Please enter a phrase or sentence >= 4 and <= 500 characters: ");
      targetString = read.nextLine();
      
      //Checks for target string length and loops for proper input
      while (targetString.length() < MINIMUM_SIZE || targetString.length() > MAXIMUM_SIZE)
      {			
         System.out.println("Please enter a phrase or sentence >= 4 and <= 500 characters: ");
         targetString = read.nextLine();
      }
      return targetString;
   }
   
   //Returns a new masked key character String 
   public static String maskChar(String getString, char getKeyChar)
   {
      final char mask = '$';
      String maskedString = "";
      
      //Checks for key character in original string
      int i = 0;      
      while ( i < getString.length())
      {
         //Checks first character of original string
         while (i == 0)
         {
            
            if (getString.charAt(i) != getKeyChar)
            {
               maskedString = getString.substring(0,1); 
            }
            else if (getString.charAt(i) == getKeyChar)
            {
               maskedString = maskedString + mask;
            }
            i++;
         }    
         
         if (getString.charAt(i) == getKeyChar)
         {
            maskedString = maskedString + mask;  
         }
         if (getString.charAt(i) != getKeyChar)
         {
            maskedString = maskedString + getString.substring(i, (i + 1));
         }
         i++;
      }
      
      System.out.println("\rString with '" + getKeyChar + "' masked: ");
      return maskedString;
   }
   
   //Returns a new removed key character String
   public static String removedKeyChar(String getString, char getKeyChar)
   {
      final String remove = "";
      String removedKeyString = "";
      
      //Checks for key character in original string
      int i = 0;
      while ( i < getString.length())
      {
         //Checks first character of original string
         while (i == 0)
         {
            if (getString.charAt(i) != getKeyChar)
            {
               removedKeyString = getString.substring(0,1); 
            }
            else if (getString.charAt(i) == getKeyChar)
            {
               removedKeyString = remove;
            }
            i++;
         }
         if (getString.charAt(i) == getKeyChar)
         {
            removedKeyString = removedKeyString + remove;  
         }
         else if (getString.charAt(i) != getKeyChar)
         {
            removedKeyString = removedKeyString + getString.substring(i, (i + 1));
         }         
         i++;
      }
      System.out.println("\rString with '" + getKeyChar + "' removed: ");
      return removedKeyString;
   }
   
   //Returns an integer for the amount of key characters
   public static int keyCount(String getString, char getKeyChar)
   {
      //Checks for key character in original string
      int i = 0, keyCount = 0;
      while ( i < getString.length())
      {
         if (getString.charAt(i) == getKeyChar)
         {
            keyCount++;
            i++;
         }
         else if (getString.charAt(i) != getKeyChar)
         {
            i++;
         }
      }
      System.out.print("\r# " + getKeyChar + "s: ");
      return keyCount;
   }
}
/*
OUTPUT 1:
Please enter a single character to act as a key: 
Please enter a single character to act as a key: 0
Please enter a phrase or sentence >= 4 and <= 500 characters: 
09i
Please enter a phrase or sentence >= 4 and <= 500 characters: 
poe had 0 dogs and 0 cats at the age of 10! his c0usin Maná also had 0 dogs and 2 cats.

String with '0' masked: 
poe had $ dogs and $ cats at the age of 1$! his c$usin Maná also had $ dogs and 2 cats.

String with '0' removed: 
poe had  dogs and  cats at the age of 1! his cusin Maná also had  dogs and 2 cats.

# 0s: 5
*/

/*
OUTPUT 2:
Please enter a single character to act as a key: popy
Please enter a single character to act as a key: 123123
Please enter a single character to act as a key: POasd][é
Please enter a single character to act as a key: 
Please enter a single character to act as a key: T
Please enter a phrase or sentence >= 4 and <= 500 characters: 
The dog had a short Tail with thick fur.

String with 'T' masked: 
$he dog had a short $ail with thick fur.

String with 'T' removed: 
he dog had a short ail with thick fur.

# Ts: 2
*/

/*
OUTPUT 3:
Please enter a single character to act as a key: t
Please enter a phrase or sentence >= 4 and <= 500 characters: 
the dog had a shorT Tail with thick fur.

String with 't' masked: 
$he dog had a shorT Tail wi$h $hick fur.

String with 't' removed: 
he dog had a shorT Tail wih hick fur.

# ts: 3
*/