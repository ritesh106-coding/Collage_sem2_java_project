import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();   

        int arr[] = new int[size];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

       
        if (found) {
            System.out.println("Element " + key + " found in the array.");
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }

        sc.close(); 
    }
}