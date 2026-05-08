public class ArrayIndexExceptionDemo {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println(" element at index 2: " + numbers[2]); 
            System.out.println(" element at index 10: " + numbers[10]); 
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid array index.");
            System.out.println("Exception message: " + e.getMessage());
        }
        finally {
            System.out.println("Execution completed. Array length is: " + numbers.length);
        }
    }
}
