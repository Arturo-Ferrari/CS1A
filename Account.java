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
final static double MAX_WITHDRAWAL_AMOUNT = 1000;
final static double MIN_WITHDRAWAL_AMOUNT = 20;
final static double MIN_DEPOSIT_AMOUNT = 20;
final static double MAX_DEPOSIT_AMOUNT = 1000;
final static double MIN_NUMBER_LENGTH = 1;
final static double MAX_NUMBER_LENGTH = 8;
final static double MIN_INITBAL_AMOUNT = 1;
final static double MAX_INITBAL_AMOUNT = 5000;
final static String MIN_OWNER_LENGTH = 1;
final static String MAX_OWNER_LENGTH = 42;





//----------------------------------------------
//Constructor -- initializes balance and owner; generates random
//account number
//----------------------------------------------
public Account (String owner) 
{
if (validOwner(owner) == true)
{ 
name = owner;
}
else
{
System.out.println("Invalid name length");
}
balance = 0;
acctNum = (int) (Math.random() * Integer.MAX_VALUE);
numAccounts++;
}

public Account(double initBal, String owner)
{
if (validInitBal(initBal) == true)
{
balance = initBal;
}
else 
{
System.out.println("Invalid initial balance amount");
}
if (validOwner(owner) == true)
{ 
name = owner;
}
else
{
System.out.println("Invalid name length");
}
acctNum = (int) (Math.random() * Integer.MAX_VALUE);
numAccounts++;

}

public Account (double initBal, String owner, int number)
{
if (validInitBal(initBal) == true)
{
balance = initBal;
}
else 
{
System.out.println("Invalid initial balance amount");
}
if (validOwner(owner) == true)
{ 
name = owner;
}
else
{
System.out.println("Invalid name length");
if (validAcctNumber(number) == true)
{
acctNum = number;
}
else
{
System.out.println("Invalid Account number");
}
numAccounts++;
}

//----------------------------------------------
// Checks to see if balance is sufficient for withdrawal.
// If so, decrements balance by amount; if not, prints message.
//----------------------------------------------
public static void withdraw(double amount)
{
if (validWithdrawal(amount) == true)
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
if (validWithdrawal(amount) == true)
{
balance -= amount;
totalWithdrawal += amount;
numWithdrawals++;
}
else
{
System.out.println("Invalid withdrawal amount");
}
if (validFee(fee) == true)
{
balance -= fee;
}
else
{
System.out.println("Invalid fee amount");
}
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
if (validDeposit(amount) == true)
{
balance += amount;
totalDeposit += amount;
numDeposits++;
}
else
{
System.out.println("Invalid deposit amount");
}
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

private static boolean validInitBal(double amount) 
{

}

private static boolean validOwner(String name)
{

}

private static boolean validAcctNumber(int number)
{

}

private static boolean validWithdrawal(double amount)
{

}
private static boolean validFee(double fee)
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