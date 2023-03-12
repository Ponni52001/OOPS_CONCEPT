package com.atm;

public interface Account 
{
   void deposit(double amount);
  void withdraw(double amount);
  void checkBalance();
  void swipe(double amount);
}
