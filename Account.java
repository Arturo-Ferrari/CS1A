//*******************************************************
// Account.java
//
// A bank account class with methods to deposit, withdraw, 
// and check the balance.
//*******************************************************

public class Account
{
private double balance;
private String name;
private long acctNum;
private static int numAccounts;
private static double totalWithdrawal;
private static double totalDeposit;
private static int numWithdrawals;
private static int numDeposits;
final static int MAX_WITHDRAWAL_AMOUNT = 1000;
final static int MIN_WITHDRAWAL_AMOUNT = 20;
final static int MIN_DEPOSIT_AMOUNT = 20;
final static int MAX_DEPOSIT_AMOUNT = 1000;
final static int MIN_NUMBER_LENGTH = 1;
final static int MAX_NUMBER_LENGTH = 8;
final static int MIN_INITBAL_AMOUNT = 1;
final static int MAX_INITBAL_AMOUNT = 5000;
final static String MIN_OWNER_LENGTH = 1;
final static String MAX_OWNER_LENGTH = 42;





//----------------------------------------------
//Constructor -- initializes balance and owner; generates random
//account number
//----------------------------------------------
public Account (String owner) 
{
name = owner;
balance = 0;
acctNum = (int) (Math.random() * Integer.MAX_VALUE);
numAccounts++;
}

public Account(double initBal, String owner)
{
balance = initBal;
name = owner;
acctNum = (int) (Math.random() * Integer.MAX_VALUE);
numAccounts++;

}

public Account (double initBal, String owner, int number)
{
balance = initBal;
name = owner;
acctNum = number;
numAccounts++;
}

//----------------------------------------------
// Checks to see if balance is sufficient for withdrawal.
// If so, decrements balance by amount; if not, prints message.
//----------------------------------------------
public static void withdraw(double amount)
{
if (balance >= amount)
{
balance -= amount;
totalWithdrawal += amount;
numWithdrawals++;
}
else
{
System.out.println("Insufficient funds");
}
}

//----------------------------------------------
// Checks to see if balance is sufficient for withdrawal.
// If so, decrements balance by amount; if not, prints message.
// Also deducts fee from account.
//----------------------------------------------
public static void withdraw(double amount, double fee)
{
if (balance >= amount)
{
balance -= amount;
balance -= fee;
totalWithdrawal += amount;
numWithdrawals++;
}
else
{
System.out.println("Insufficient funds");
}
}

public static void withdraw(double fee)
{
if (balance >= fee)
{
balance -= fee;
numWithdrawals++;
}
else
{
System.out.println("Insufficient funds");
}
}
//----------------------------------------------
// Adds deposit amount to balance.
//----------------------------------------------


public static void deposit(double amount)
{
balance += amount;
totalDeposit += amount;
numDeposits++;
}

//----------------------------------------------
// Returns balance.
//----------------------------------------------
public double getBalance()
{
return balance;
}

//----------------------------------------------
// Returns account number
//----------------------------------------------
public double getAcctNumber()
{
return acctNum;
}


//Returns the total number of accounts

private static int getNumAccounts() 
{
return numAccounts;
}

//Returns the total withdrawal amount

public static double getWithdrawalAmount()
{
return totalWithdrawal;
}

//Returns the total deposit amount

public static double getDepositAmount()
{
return totalDeposit;
}

//Returns the total number of withdrawals

public static int getNumWithdrawals()
{
return numWithdrawals;
}

//Returns the total number of deposits

public static int getNumDeposits()
{
return numDeposits;
}

//Resets Withdrawal and Deposit counters and totals
public static void resetTotalsAndCounters() 
{
totalWithdrawal = 0;
totalDeposit = 0;
numWithdrawals = 0;
numDeposits = 0;
}

private static boolean validInitBal() 
{

}

private static boolean validOwner()
{

}

private static boolean validAcctNumber()
{

}

private static boolean validWithdrawAmount()
{

}

private static boolean validDepositAmount()
{

}




//----------------------------------------------
// Returns a string containing the name, acct number, and balance.
//----------------------------------------------

public String toString()
{
return "Name: " + name + 
"\nAcct #: " + acctNum + 
"\nBalance: " + balance;
}

}