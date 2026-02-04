// swap two number using third variable
class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temp;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}