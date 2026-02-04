//4.Find largest element in an array
package collage;
import java.util.Scanner;
class LargestInArray{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array:");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter the elements of array:");
for(int i=0; i<size; i++)
{
    arr[i]=sc.nextInt();
}
int largest=arr[0];
for(int i=0; i<size; i++)
{
    if(arr[i]>largest)
    {
        largest=arr[i];
    }
}
System.out.println("The largest element in the array is: " + largest);
sc.close();
}
}