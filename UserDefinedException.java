class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}

public class UserDefinedException
{
    public static void main(String args[])
    {
        int number = -1;

        try
        {
            if(number < 0)
            {
                throw new MyException("Negative number not allowed");
            }

            System.out.println("Valid Number");
        }
        catch(MyException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
