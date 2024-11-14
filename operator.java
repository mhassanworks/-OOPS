// ComplexNumber.java
public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to subtract two complex numbers
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Method to multiply two complex numbers
    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Method to divide two complex numbers
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Method to display the complex number
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    // Main method for testing
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(2, 3);

        // Testing addition
        ComplexNumber sum = c1.add(c2);
        System.out.println("Sum: " + sum);

        // Testing subtraction
        ComplexNumber difference = c1.subtract(c2);
        System.out.println("Difference: " + difference);

        // Testing multiplication
        ComplexNumber product = c1.multiply(c2);
        System.out.println("Product: " + product);

        // Testing division
        ComplexNumber quotient = c1.divide(c2);
        System.out.println("Quotient: " + quotient);
    }
}
