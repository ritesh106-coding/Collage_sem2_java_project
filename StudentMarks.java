import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int s1, s2, s3, s4, s5;
        int sum;
        float percentage;

        System.out.println("Enter marks of 5 subjects:");

        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        s4 = sc.nextInt();
        s5 = sc.nextInt();

        sum = s1 + s2 + s3 + s4 + s5;

        percentage = sum / 5.0f;

        System.out.println("Total Marks = " + sum);
        System.out.println("Percentage = " + percentage + "%");
    }
}
