/* 
 * Class: CS1A
 * Description: Uses a user-defined class with methods that access and mutate its object parameters
 * Due Date: March 3, 2017
 * Name: Arturo Ferrari Jr.
 * File name: TestTripleString.java
 */
import java.util.*;
import java.lang.Math;
public class TestTripleString 
{
   public static void main(String [] args)
   {
      TripleString one = new TripleString();
      TripleString two = new TripleString();
      TripleString three = new TripleString("Hello,", "Good Morning.", "Happy Birthday!");
      TripleString four = new TripleString("", "What would a woødchuck chuck if a woodchuck could chuck wood?", "12");
      //First output section 
      System.out.println("TripleStrings after instantiation ----------" + "\r");
      System.out.println(one.toString());
      System.out.println(two.toString());
      System.out.println(three.toString());
      System.out.println(four.toString());

      String mutateOne = "Alabama";
      String mutateTwo = "Q";
      String mutateThree = "";
      String mutateFour = "Televize";
      one.setString1(mutateOne);
      two.setString2(mutateTwo);
      three.setString3(mutateThree);
      four.setString1(mutateFour);
      //Second output section
      System.out.println("\rTripleStrings after changes ----------");
      System.out.println(one.toString());
      System.out.println(two.toString());
      System.out.println(three.toString());
      System.out.println(four.toString());
      //Third output section
      System.out.println("\rMutator Tests ---------");
      if (three.getString3() == "") {
         System.out.println("String accepted.");
      }
      else {
         System.out.println("Correctly rejected string");
      }
      if (two.getString2() == "Q") {
         System.out.println("String accepted.");
      }
      else {
         System.out.println("Correctly rejected string");
      }
      //Fourth output section
      System.out.println("\rAccessor Tests --------");
      System.out.print("TripleString1 String 1: ");
      System.out.println(one.getString1());
      System.out.print("TripleString3 String 3: ");
      System.out.println(three.getString3());
   }
}
class TripleString
{
   //private instance class members
   private String string1;
   private String string2;
   private String string3;
   //legal string limits
   final static int MIN_LEN = 1;
   final static int MAX_LEN = 50; 
   //default values for no-arg constructors and illegal parameters
   final static String DEFAULT_STRING = "(undefined)";
   final static String ILLEGAL_STRING = "This is an illegal string.";

   //No-arg constructor
   TripleString() {
      string1 = DEFAULT_STRING;
      string2 = DEFAULT_STRING;
      string3 = DEFAULT_STRING;
   }
   //Parameter taking constructor
   TripleString(String str1, String str2, String str3) {
      setString1(str1);
      setString2(str2);
      setString3(str3);

   }
   //Accessors for all strings
   public String getString1() {
      String str = string1;
      return str;
   }
   public String getString2() {
      String str = string2;
      return str;
   }
   public String getString3() {
      String str = string3;
      return str;
   }
   //Mutators for all strings
   public void setString1(String newstr) {
      if (validString(newstr) == true) {
         string1 = newstr;
      }
   }
   public void setString2(String newstr) {
      if (validString(newstr) == true) {
         string2 = newstr;
      }
   }
   public void setString3(String newstr) {
      if (validString(newstr) == true) {
         string3 = newstr;
      }
   }
   //support method or helper function
   private static boolean validString(String str) {
      boolean string = false;
      if (str.length() <= MAX_LEN && str.length() >= MIN_LEN)
      {
         string = true;
      }
      else if (str.length() > MAX_LEN || str.length() < MIN_LEN) {
         string = false;
      }
      return string;
   }
   public String toString() {
      return "\r" + string1 + "\n" + string2 + "\n" + string3; 
   }
}
/* OUTPUT:
TripleStrings after instantiation ----------

(undefined)
(undefined)
(undefined)

(undefined)
(undefined)
(undefined)

Hello,
Good Morning.
Happy Birthday!

null
null
12

TripleStrings after changes ----------

Alabama
(undefined)
(undefined)

(undefined)
Q
(undefined)

Hello,
Good Morning.
Happy Birthday!

Televize
null
12

Mutator Tests ---------
Correctly rejected string
String accepted.

Accessor Tests --------
TripleString1 String 1: Alabama
TripleString3 String 3: Happy Birthday!
 */