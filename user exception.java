// Step 1: Define a custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Step 2: Throw the custom exception
class UserRegistration {
    public void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register.");
        }
        System.out.println("User registered successfully!");
    }
}

// Step 3: Handle the exception
public class CustomExceptionExample {
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        try {
            user.registerUser(16);  // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
