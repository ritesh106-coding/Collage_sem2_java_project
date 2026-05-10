 // InsufficientBalanceException
class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String message)
    {
        super(message);
    }
}
class ATMWithdrawal{
   public static void main(String[] args){
       int balance=50000;
       int withdraw=80000;
       try{
           if(withdraw>balance){
               throw new InsufficientBalanceException("Insufficient Balance");
           }
           balance=balance-withdraw;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
       }catch(InsufficientBalanceException e){
          System.out.println("Exception: " + e.getMessage());
       }
       finally{
           System.out.println("ATM continuous...........");
       }
   }
}



