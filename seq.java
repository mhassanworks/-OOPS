import java.io.*;

public class SequentialAccessExample {
    public static void main(String[] args) {
        String fileName = "example.txt"; // Replace with your file path

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Reading file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
