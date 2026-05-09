import java.util.Scanner;

class PalindromeNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int num, reverse = 0, rem, original;

        System.out.println("Enter a number:");
        num = sc.nextInt();

        original = num;

        while(num != 0)
        {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reversed Number = " + reverse);

        if(original == reverse)
        {
            System.out.println("It is a Palindrome Number");
        }
        else
        {
            System.out.println("It is not a Palindrome Number");
        }
    }
}
