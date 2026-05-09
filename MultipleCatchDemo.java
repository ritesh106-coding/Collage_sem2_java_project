// Java Program to Handle the Exception Using Try and 
// Multiple Catch Block 
class MultipleCatchDemo
{
    public static void main(String args[])
    {
        try
        {
            int a = 10;
            int b = 0;

            int result = a / b;

            int arr[] = {1, 2, 3};

            System.out.println(arr[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds");
        }
        catch(Exception e)
        {
            System.out.println("Some other exception occurred");
        }

        System.out.println("Program ended");
    }
}
