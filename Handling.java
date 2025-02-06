public class StringHandlingExample {
    public static void main(String[] args) {
        // Creating Strings
        String str1 = "Hello, World!";
        String str2 = new String("Java String");

        // String Methods
        System.out.println("Original String: " + str1);
        System.out.println("Length: " + str1.length());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Substring (0-5): " + str1.substring(0, 5));
        System.out.println("Replaced: " + str1.replace("World", "Java"));
        System.out.println("Trimmed: " + "  Hello  ".trim());
        System.out.println("Character at index 4: " + str1.charAt(4));
        System.out.println("Contains 'World': " + str1.contains("World"));
        System.out.println("Starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("Ends with '!': " + str1.endsWith("!"));

        // String Comparison
        String s1 = "Hello";
        String s2 = "hello";
        System.out.println("\nString Comparison:");
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
        System.out.println("CompareTo: " + s1.compareTo(s2));

        // String Concatenation
        String a = "Java";
        String b = "Programming";
        System.out.println("\nConcatenation:");
        System.out.println("Using '+': " + a + " " + b);
        System.out.println("Using concat(): " + a.concat(" ").concat(b));

        // Splitting a String
        String data = "apple,banana,grape";
        String[] fruits = data.split(",");
        System.out.println("\nSplitting:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.delete(5, 6);
        sb.reverse();
        System.out.println("\nStringBuilder Operations:");
        System.out.println("Reversed: " + sb.toString());

        // Using StringBuffer
        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Programming");
        System.out.println("\nStringBuffer:");
        System.out.println(sbf.toString());

        // Formatting a String
        String formatted = String.format("\nMy name is %s and I am %d years old.", "Hassan", 21);
        System.out.println("\nFormatted String:");
        System.out.println(formatted);
    }
}
