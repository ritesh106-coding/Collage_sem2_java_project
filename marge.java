//Using System.arraycopy()
import java.util.Arrays;

public class mergearray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] merged = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}


//============================2nd======================================================
// Merge two arrays into a new array
// import java.util.Arrays;

// public class mergearrays {
//     public static void main(String[] args) {
//         int[] arr1 = {1, 2, 3};
//         int[] arr2 = {4, 5, 6};

//         int[] merged = new int[arr1.length + arr2.length];

//         // Copy first array
//         for (int i = 0; i < arr1.length; i++) {
//             merged[i] = arr1[i];
//         }

//         // Copy second array
//         for (int i = 0; i < arr2.length; i++) {
//             merged[arr1.length + i] = arr2[i];
//         }

//         System.out.println("Merged array: " + Arrays.toString(merged));
//     }
// }
