package com.Validation;

import java.util.Scanner;

public class Validator {

    public static int validateNumberInput() {
        Scanner input = new Scanner(System.in);
        int option = 0;

        while (true) {
            if (input.hasNextInt()) {
                option = input.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine(); // clear the input buffer
            }
        }

        return option;
    }
  public static int validateAge()
  {
      Scanner input = new Scanner(System.in);
      int age = 0;
      while (true) {
          if (input.hasNextInt())
          {
               age=input.nextInt();
              if(age>0&&age<120) {

                  break;
              }
              else{
                  System.out.println("Invalid Age. Please enter a valid one.");
                  input.nextLine();
              }
          }
          else {
              System.out.println("Invalid Age. Please enter a valid one.");
              input.nextLine();
          }
      }

      return age;
  }
    public static String validateName() {
        Scanner input = new Scanner(System.in);
        String name = "";
        boolean validName = false;

        while (!validName) {
            name = input.nextLine();
            boolean containsNonAlphabetic = name.matches(".*[^a-zA-Z\\s].*");

            if (!containsNonAlphabetic) {
                validName = true;
            } else {
                System.out.println("Invalid name. Please enter a valid one.");
            }
        }

        return name;
    }

    public static long validateAccountNumber() {
        Scanner input = new Scanner(System.in);
        boolean validAccountNumber = false;
        long accountNumber = 0;
        while (!validAccountNumber) {
            if (input.hasNextLong()) {
                accountNumber = input.nextLong();
                String accountNumberString = Long.toString(accountNumber);
                int length = accountNumberString.length();
                Boolean containsSpace = accountNumberString.contains(" ");
                if (length == 11 && (!containsSpace)) {
                    validAccountNumber = true;
                }
            }
            if (!validAccountNumber) {
                System.out.println("Invalid account number. Please enter a valid one:");
                input.nextLine(); 
            }
        }
        return accountNumber;
    }

    public static double validateAccountBalance()
    {
        Scanner input = new Scanner(System.in);
        int accountBalance = 0;

        while (true) {
            if (input.hasNextDouble()) {
                accountBalance = input.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a correct account balance:");
                input.nextLine();
            }
        }

        return accountBalance;
    }
    public static double validateCurrency() {
        Scanner input = new Scanner(System.in);
        double amount = 0;

        while (true) {
            if (input.hasNextDouble()) {
                amount = input.nextDouble();
                if (amount >= 0) {
                    break;
                }
                System.out.println("Amount must be non-negative.");
            } else {
                System.out.println("Enter a valid amount.");
                input.nextLine();
            }
        }
        return amount;
    }

    public static int validAtmTransactionInput()
    {
        Scanner input=new Scanner(System.in);
        int option = 0;
        while(true) {
            if (input.hasNextInt()) {
                int temporaryOption = input.nextInt();
                if (temporaryOption < 5 && temporaryOption >= 0) {
                    option = temporaryOption;
                    break;
                }
                else{
                    System.out.println("Invalid input. Please enter a valid number.");
                    input.nextLine();
                }
            }
            else{
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine(); 
        }

        }
        return option;
    }
    public static boolean validateUserDetails(String cardNumber,String pin)
    {
        if(cardNumber.length()==14&&pin.length()==4)
        {
            return true;
        }
        return false;
    }
}


