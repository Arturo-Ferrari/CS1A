/*
Class: CS1A
Description: Point of purchase program for chocolate bars
Due Date: February 15, 2017
Name: Arturo Ferrari Jr.
File name: ChocolateCoupons.java
 */
import java.util.Scanner;
public class ChocolateCoupons 
{
   public static void main(String [] args)
   {
      //variable declaration, initialize Scanner object
      final int MAX_INTEGER_VALUE = 2147483647, startingBalance = 0, awardBalance = 0;
      int chocolateBars, couponBalance, redeemChocolate;
      char ch, yn;
      String input;
      String yesOrNo;
      chocolateBars = 0;
      couponBalance = 0;
      redeemChocolate = 7;

      //main menu loop
      for (int i = 0; i >= 0;i++)
      {
         //Prompts for and reads P or S       
         System.out.println("\rMain menu: ");
         System.out.println("\r P (process purchase)");
         System.out.println("\r S (shut down)");
         Scanner menu = new Scanner(System.in);
         input = menu.nextLine();
         System.out.println("\r Your Choice: " + input);
         ch = input.charAt(0);

         if (ch != 'p' && ch != 'P' && ch != 's' && ch != 'S')
         { 
            System.out.println("\rUse p or s.");          
         }
         //'S' at main menu
         else if ((ch == 's'||ch == 'S') && (ch != 'p'||ch !='P'))
         {
            System.out.println("\rThe system will now shut down.");
            System.exit(0);
         }
         //'P' at main menu
         else if ((ch != 's'||ch != 'S') && (ch == 'p'||ch == 'P'))
         {
            //modified award transaction in case customer reaches the max value of the integer type
            if ((ch == 'p' ||ch == 'P') && couponBalance == MAX_INTEGER_VALUE)
            {
               System.out.println("\rYou have too many coupons!");
               System.out.println("\rYou qualify for a free chocolate bar. Would you like to use your credits? (Y or N)");
               Scanner redeem = new Scanner(System.in);
               yesOrNo = redeem.nextLine();
               yn = yesOrNo.charAt(0);
             
               //award transaction
               if ((yn != 'n' || yn != 'N') && (yn == 'y'||yn == 'Y'))
               {
                  //computes and prints redeem transaction and remaining coupons 
                  couponBalance -= redeemChocolate;                           
                  System.out.println("You have just used 7 credits and have " + couponBalance + " left.");
                  System.out.println("Enjoy your free chocolate bar!");
               }
               else if (yn != 'y' && yn != 'Y' && yn != 'n' && yn != 'N')
               {
                  System.out.println("Invalid response.");
               }
            }
            //normal transaction
            else if  ((ch== 'p'||ch == 'P') && (couponBalance < awardBalance))
            {
               //reads amount of chocolate bars in purchase
               System.out.println("\rHow many chocolate bars would you like to buy?");
               chocolateBars = menu.nextInt();               
              
               if ((chocolateBars >= startingBalance) && (couponBalance + chocolateBars <= MAX_INTEGER_VALUE))
               {
                  //computes and prints total coupon balance
                  couponBalance += chocolateBars;
                  if (couponBalance >= startingBalance)
                  {
                     System.out.println("\rYou just earned " + chocolateBars + " coupons and have a total of " + couponBalance + " to use." + "\n");  
                  }
                  //in case user buys coupons over the max value of the coupon balance integer type
                  else if (couponBalance < startingBalance)
                  {
                     System.out.println("Invalid number of chocolate bars.");
                     couponBalance -= chocolateBars;                        
                  }
               }
               //bad amount of chocolate bars
               else if ((chocolateBars < startingBalance||chocolateBars > MAX_INTEGER_VALUE)||(couponBalance + chocolateBars > MAX_INTEGER_VALUE))
               {
                  System.out.println("Invalid number of chocolate bars.");
                  couponBalance -= chocolateBars;
               }
            }

            else if ((ch == 'p' ||ch == 'P') && (couponBalance >= awardBalance) && (couponBalance < MAX_INTEGER_VALUE)) 
            { 
               //Prompts for and reads redeeming a free chocolate bar
               System.out.println("\rYou qualify for a free chocolate bar. Would you like to use your credits? (Y or N)");
               Scanner redeem = new Scanner(System.in);
               yesOrNo = redeem.nextLine();
               yn = yesOrNo.charAt(0);

               //award transaction
               if ((yn != 'n' || yn != 'N') && (yn == 'y'||yn == 'Y'))
               {
                  //computes and prints transaction and remaining coupons 
                  couponBalance -= redeemChocolate;                           
                  System.out.println("You have just used 7 credits and have " + couponBalance + " left.");
                  System.out.println("Enjoy your free chocolate bar!");
               }

               // award transaction (opt-out) 
               else if (yn == 'n'||yn == 'N')
               {
                  //prompts for and reads chocolate bar transaction
                  System.out.println("\rHow many chocolate bars would you like to buy?");
                  chocolateBars = menu.nextInt();
                  
                  //computes and prints total redeemable coupons and transaction 
                  if ((chocolateBars >= startingBalance) && (couponBalance + chocolateBars <= MAX_INTEGER_VALUE))
                  {
                     couponBalance += chocolateBars;
                     if (couponBalance > startingBalance)
                     {
                        System.out.println("\rYou just earned " + chocolateBars + " coupons and have a total of " + couponBalance + " to use." + "\n");  
                     }
                     else if (couponBalance < startingBalance)
                     {
                        System.out.println("Invalid number of chocolate bars.");
                        couponBalance -= chocolateBars;                        
                     }
                  }
                  //bad amount of chocolate purchased
                  else if ((chocolateBars < startingBalance||chocolateBars > MAX_INTEGER_VALUE)||(couponBalance + chocolateBars > MAX_INTEGER_VALUE))
                  {
                     System.out.println("Invalid number of chocolate bars.");
                     couponBalance -= chocolateBars;
                  }
               }

               //in case of a non-numeric input error from the user in the award transaction path 
               else if ((yn != 'y' ||yn != 'Y') && (yn != 'n'||yn != 'N'))
               {
                  System.out.println("Invalid response.");
               }
            }
         }   
      } 
   }
}
/*
OUTPUT 1:

Main menu: 

 P (process purchase)

 S (shut down)
P

 Your Choice: P

How many chocolate bars would you like to buy?
0

You just earned 0 coupons and have a total of 0 to use.


Main menu: 

 P (process purchase)

 S (shut down)
pop

 Your Choice: pop

How many chocolate bars would you like to buy?
5

You just earned 5 coupons and have a total of 5 to use.


Main menu: 

 P (process purchase)

 S (shut down)
p

 Your Choice: p

How many chocolate bars would you like to buy?
1

You just earned 1 coupons and have a total of 6 to use.


Main menu: 

 P (process purchase)

 S (shut down)
Pop

 Your Choice: Pop

How many chocolate bars would you like to buy?
8

You just earned 8 coupons and have a total of 14 to use.


Main menu: 

 P (process purchase)

 S (shut down)
p

 Your Choice: p

You qualify for a free chocolate bar. Would you like to use your credits? (Y or N)
y
You have just used 7 credits and have 7 left.
Enjoy your free chocolate bar!

Main menu: 

 P (process purchase)

 S (shut down)
p

 Your Choice: p

You qualify for a free chocolate bar. Would you like to use your credits? (Y or N)
n

How many chocolate bars would you like to buy?
-8
Invalid number of chocolate bars.

Main menu: 

 P (process purchase)

 S (shut down)
p

 Your Choice: p

You qualify for a free chocolate bar. Would you like to use your credits? (Y or N)
Yellow
You have just used 7 credits and have 8 left.
Enjoy your free chocolate bar!

Main menu: 

 P (process purchase)

 S (shut down)
p

 Your Choice: p

You qualify for a free chocolate bar. Would you like to use your credits? (Y or N)
bill
Invalid response.

Main menu: 

 P (process purchase)

 S (shut down)
p

 Your Choice: p

You qualify for a free chocolate bar. Would you like to use your credits? (Y or N)
No

How many chocolate bars would you like to buy?
1

You just earned 1 coupons and have a total of 9 to use.


Main menu: 

 P (process purchase)

 S (shut down)
chocolate

 Your Choice: chocolate

Use p or s.

Main menu: 

 P (process purchase)

 S (shut down)
sweet

 Your Choice: sweet

The system will now shut down.
 */

/*
OUTPUT 2:
Main menu: 

 P (process purchase)

 S (shut down)
p

 Your Choice: p

How many chocolate bars would you like to buy?
2147483647

You just earned 2147483647 coupons and have a total of 2147483647 to use.


Main menu: 

 P (process purchase)

 S (shut down)
p

 Your Choice: p

You have too many coupons!

You qualify for a free chocolate bar. Would you like to use your credits? (Y or N)
k
Invalid response.

Main menu: 

 P (process purchase)

 S (shut down)
p

 Your Choice: p

You have too many coupons!

You qualify for a free chocolate bar. Would you like to use your credits? (Y or N)
n

Main menu: 

 P (process purchase)

 S (shut down)
p

 Your Choice: p

You have too many coupons!

You qualify for a free chocolate bar. Would you like to use your credits? (Y or N)
y
You have just used 7 credits and have 2147483640 left.
Enjoy your free chocolate bar!

Main menu: 

 P (process purchase)

 S (shut down)
p

 Your Choice: p

You qualify for a free chocolate bar. Would you like to use your credits? (Y or N)
n

How many chocolate bars would you like to buy?
8
Invalid number of chocolate bars.

Main menu: 

 P (process purchase)

 S (shut down)
S

 Your Choice: S

The system will now shut down.
*/