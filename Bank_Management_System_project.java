// I added a complete Java Bank Management System project with:
// Account creation
// Deposit
// Withdraw
// Balance check
// Show all accounts
// ArrayList
// OOP concepts
// Menu-driven program


import java.util.ArrayList;
import java.util.Scanner;

// Account class stores customer information
class Account {

    // Variables
    int accountNumber;
    String name;
    double balance;

    Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // method for depositing money..................................................
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully");
    }

    // method for withdrawing money.........................................................
    void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        }

        else {
            balance = balance - amount;
            System.out.println("Withdraw Successful");
        }
    }

    // method for displaying account details
    void display() {
        System.out.println("---------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Name           : " + name);
        System.out.println("Balance        : " + balance);
        System.out.println("---------------------------");
    }
}

// main class
public class Bank_Management_System_project{

    static ArrayList<Account> accounts = new ArrayList<>();

    static Scanner s = new Scanner(System.in);

    // create new bank account
    public static void createAccount() {

        System.out.print("Enter Account Number: ");
        int accNo = s.nextInt();
        s.nextLine();

        System.out.print("Enter Name: ");
        String name = s.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = s.nextDouble();

        Account obj = new Account(accNo, name, balance);

        accounts.add(obj);

        System.out.println("Account Created Successfully");
    }

    // search account using account number
    public static Account searchAccount(int accNo) {

        for (Account acc : accounts) {

            if (acc.accountNumber == accNo) {
                return acc;
            }
        }

        return null;
    }

    // deposit money into account
    public static void depositMoney() {

        System.out.print("Enter Account Number: ");
        int accNo = s.nextInt();

        Account acc = searchAccount(accNo);

        if (acc != null) {

            System.out.print("Enter Amount: ");
            double amount = s.nextDouble();

            acc.deposit(amount);
        }

        else {
            System.out.println("Account Not Found");
        }
    }

    // withdraw money from account
    public static void withdrawMoney() {

        System.out.print("Enter Account Number: ");
        int accNo = s.nextInt();

        Account acc = searchAccount(accNo);

        if (acc != null) {

            System.out.print("Enter Amount: ");
            double amount = s.nextDouble();

            acc.withdraw(amount);
        }

        else {
            System.out.println("Account Not Found");
        }
    }

    // check account balance
    public static void checkBalance() {

        System.out.print("Enter Account Number: ");
        int accNo = s.nextInt();

        Account acc = searchAccount(accNo);

        if (acc != null) {
            acc.display();
        }

        else {
            System.out.println("Account Not Found");
        }
    }

    // display all accounts
    public static void showAllAccounts() {

        if (accounts.size() == 0) {
            System.out.println("No Accounts Available");
        }

        else {

            for (Account acc : accounts) {
                acc.display();
            }
        }
    }

    public static void main(String[] args) {

        // Infinite loop for menu
        while (true) {

            System.out.println("\n====== BANK MANAGEMENT SYSTEM ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Show All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");

            int choice = s.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    checkBalance();
                    break;

                case 5:
                    showAllAccounts();
                    break;

                case 6:
                    System.out.println("Thank You");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}


//--------------------------------------------try2---------------------------------------------------------------------
// import java.util.ArrayList;
// import java.util.Scanner;

// class Account {

//     int accountNumber;
//     String name;
//     double balance;

//     Account(int accountNumber, String name, double balance) {
//         this.accountNumber = accountNumber;
//         this.name = name;
//         this.balance = balance;
//     }

//     void deposit(double amount) {
//         balance = balance + amount;
//         System.out.println("Amount Deposited Successfully");
//     }

//     void withdraw(double amount) {

//         if (amount > balance) {
//             System.out.println("Insufficient Balance");
//         }

//         else {
//             balance = balance - amount;
//             System.out.println("Withdraw Successful");
//         }
//     }

//     void display() {
//         System.out.println("---------------------------");
//         System.out.println("Account Number : " + accountNumber);
//         System.out.println("Name           : " + name);
//         System.out.println("Balance        : " + balance);
//         System.out.println("---------------------------");
//     }
// }

// public class Bank_Management_System_project {

//     static ArrayList<Account> accounts = new ArrayList<>();

//     static Scanner s = new Scanner(System.in);

//     public static void createAccount() {

//         System.out.print("Enter Account Number: ");
//         int accNo = s.nextInt();
//         s.nextLine();

//         System.out.print("Enter Name: ");
//         String name = s.nextLine();

//         System.out.print("Enter Initial Balance: ");
//         double balance = s.nextDouble();

//         Account obj = new Account(accNo, name, balance);

//         accounts.add(obj);

//         System.out.println("Account Created Successfully");
//     }

//     public static Account searchAccount(int accNo) {

//         for (Account acc : accounts) {

//             if (acc.accountNumber == accNo) {
//                 return acc;
//             }
//         }

//         return null;
//     }

//     public static void depositMoney() {

//         System.out.print("Enter Account Number: ");
//         int accNo = s.nextInt();

//         Account acc = searchAccount(accNo);

//         if (acc != null) {

//             System.out.print("Enter Amount: ");
//             double amount = s.nextDouble();

//             acc.deposit(amount);
//         }

//         else {
//             System.out.println("Account Not Found");
//         }
//     }

//     public static void withdrawMoney() {

//         System.out.print("Enter Account Number: ");
//         int accNo = s.nextInt();

//         Account acc = searchAccount(accNo);

//         if (acc != null) {

//             System.out.print("Enter Amount: ");
//             double amount = s.nextDouble();

//             acc.withdraw(amount);
//         }

//         else {
//             System.out.println("Account Not Found");
//         }
//     }

//     public static void checkBalance() {

//         System.out.print("Enter Account Number: ");
//         int accNo = s.nextInt();

//         Account acc = searchAccount(accNo);

//         if (acc != null) {
//             acc.display();
//         }

//         else {
//             System.out.println("Account Not Found");
//         }
//     }

//     public static void showAllAccounts() {

//         if (accounts.size() == 0) {
//             System.out.println("No Accounts Available");
//         }

//         else {

//             for (Account acc : accounts) {
//                 acc.display();
//             }
//         }
//     }

//     public static void main(String[] args) {

//         while (true) {

//             System.out.println("\n====== BANK MANAGEMENT SYSTEM ======");
//             System.out.println("1. Create Account");
//             System.out.println("2. Deposit Money");
//             System.out.println("3. Withdraw Money");
//             System.out.println("4. Check Balance");
//             System.out.println("5. Show All Accounts");
//             System.out.println("6. Exit");

//             System.out.print("Enter Choice: ");

//             int choice = s.nextInt();

//             switch (choice) {

//                 case 1:
//                     createAccount();
//                     break;

//                 case 2:
//                     depositMoney();
//                     break;

//                 case 3:
//                     withdrawMoney();
//                     break;

//                 case 4:
//                     checkBalance();
//                     break;

//                 case 5:
//                     showAllAccounts();
//                     break;

//                 case 6:
//                     System.out.println("Thank You");
//                     System.exit(0);
//                     break;

//                 default:
//                     System.out.println("Invalid Choice");
//             }
//         }
//     }
// }
