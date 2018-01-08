/*
 * Class: CS 1A
 * Description: The user plays a word game by entering info
 * Due Date: January 25, 2017
 * Name: Arturo Ferrari Jr.
 * File name: WordGame.java
 */
import java.util.Scanner;
public class WordGame 
{
   public static void main(String [] args)
   {
      int age;
      String name, city, college, profession, animal, pet;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter your name: ");
      name = scan.nextLine();
      System.out.print("Enter your age: ");
      age = scan.nextInt();
      scan.nextLine(); // Consumes the remaining newline from the nextInt method.
      System.out.print("Enter the name of a city: ");
      city = scan.nextLine();
      System.out.print("Enter the name of a college: ");
      college = scan.nextLine();
      System.out.print("Enter a profession: ");
      profession = scan.nextLine();      
      System.out.print("Enter a type of animal: ");
      animal = scan.nextLine();
      System.out.print("Enter a pet's name: ");
      pet = scan.nextLine();
      System.out.print("There once was a person named " + name);
      System.out.println(" who lived in " + city + ".");
      System.out.print("At the age of " + age + ", " + name);
      System.out.println(" went to college at " + college + ". ");
      System.out.print(name + " graduated and went to work as a(n) ");
      System.out.println(profession + ".");
      System.out.print("Then, ");
      System.out.print(name + " adopted a(n) " + animal + " named " + pet);
      System.out.println(".");
      System.out.print("They both lived happily ever after!");
      scan.close();
   }
}
/*
Enter your name: Arturo
Enter your age: 24
Enter the name of a city: San Carlos
Enter the name of a college: Foothill College
Enter a profession: Butcher
Enter a type of animal: dog
Enter a pet's name: Bender
There once was a person named Arturo who lived in San Carlos.
At the age of 24, Arturo went to college at Foothill College. 
Arturo graduated and went to work as a(n) Butcher.
Then, Arturo adopted a(n) dog named Bender.
They both lived happily ever after!
*/