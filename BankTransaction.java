/*
 * Class: CS1A
 * Description: withdraws and deposits money from checking and saving accounts and prints their balance.
 * Due Date: February 1, 2017
 * Name: Arturo Ferrari Jr.
 * File Name: BankTransaction.java
 */

import java.util.Scanner;
public class BankTransaction 
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in); //declare and initialize Scanner object
      double checkingBalance, savingBalance, depositChecking, depositSavings, withdrawChecking, withdrawSaving;
      int bankAccount, bankTransaction;
      System.out.print("Enter initial balance for checking: "); //Prompt for and read the initial checking account balance
      checkingBalance = scan.nextDouble();
      System.out.print("Enter initial balance for savings: "); //Prompt for and read the initial savings account balance
      savingBalance = scan.nextDouble();
      System.out.print("1) Deposit or 2) Withdraw? "); //Prompt for and read the specified transaction
      bankAccount = scan.nextInt();
      if (bankAccount == 1)
      {
         System.out.print("Deposit to 1) Checking or 2) Savings? "); //Prompt for and read where the deposit goes
         bankTransaction = scan.nextInt();
         if (bankTransaction == 1)
         {
            System.out.print("Deposit how much? "); //Prompt for and read the amount of the deposit
            depositChecking = scan.nextDouble();
            checkingBalance += depositChecking; //computes and stores the new amount within the checking account
         }   
         if (bankTransaction == 2)
         {
            System.out.print("Deposit how much? "); //Prompt for and read the amount of the deposit
            depositSavings = scan.nextDouble();
            savingBalance += depositSavings; //computes and stores the new amount after deposit
         }   
      }
      if (bankAccount == 2)
      {
         System.out.print("Withdraw from 1) Checking or 2) Saving? "); //Prompt for and read where to withdrawal from
         bankTransaction = scan.nextInt();
         if (bankTransaction == 1)
         {
            System.out.print("Withdraw how much? "); //Prompt for and read how much is withdrawn
            withdrawChecking = scan.nextDouble();
            checkingBalance -= withdrawChecking; //computes the new amount after withdrawal
            if (checkingBalance < 0)
            {
               System.out.println("There isn't that much money in the account!"); //Notifies the user of a bad transaction
               checkingBalance += withdrawChecking; //computes the new amount after withdrawal error
            }   
         }      
         if (bankTransaction == 2)
         {
            System.out.print("Withdraw how much? "); //Prompt for and read how much is withdrawn
            withdrawSaving = scan.nextDouble();
            savingBalance -= withdrawSaving; //computes the new amount after withdrawal
            if (savingBalance < 0)
            {
               System.out.println("There isn't that much money in the account!"); //Notifies the user of a bad transaction
               savingBalance += withdrawSaving; //computes the new amount after withdrawal error
            }
         }
      }   
      System.out.println("After the transaction: "); //Prints the Savings and Checking account balances
      System.out.println("Saving Balance: " + savingBalance);
      System.out.print("Checking Balance: " + checkingBalance);      
   }
}

