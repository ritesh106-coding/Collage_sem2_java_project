import java.util.Scanner;

class SwapNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a, b, temp;

        System.out.println("Enter first number:");
        a = sc.nextInt();

        System.out.println("Enter second number:");
        b = sc.nextInt();


        System.out.println("Before swapping:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
