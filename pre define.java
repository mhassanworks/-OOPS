import java.util.Arrays;

public class PredefinedExample {
    public static void main(String[] args) {
        // Using a predefined method from System class
        System.out.println("Hello, Java!");

        // Using predefined Math class
        double squareRoot = Math.sqrt(25);
        System.out.println("Square root of 25: " + squareRoot);

        // Using predefined Arrays class
        int[] numbers = {5, 2, 8, 1, 3};
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
