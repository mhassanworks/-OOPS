import java.util.ArrayList;
import java.util.Scanner;

public class CRUDExample {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== CRUD Operations Menu ===");
            System.out.println("1. Add Item");
            System.out.println("2. View Items");
            System.out.println("3. Update Item");
            System.out.println("4. Delete Item");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    items.add(scanner.nextLine());
                    System.out.println("Item added successfully!");
                    break;
                case 2:
                    System.out.println("\nItems List:");
                    if (items.isEmpty()) {
                        System.out.println("No items found.");
                    } else {
                        for (int i = 0; i < items.size(); i++) {
                            System.out.println((i + 1) + ". " + items.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter item number to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (updateIndex >= 0 && updateIndex < items.size()) {
                        System.out.print("Enter new value: ");
                        items.set(updateIndex, scanner.nextLine());
                        System.out.println("Item updated successfully!");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    System.out.print("Enter item number to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (deleteIndex >= 0 && deleteIndex < items.size()) {
                        items.remove(deleteIndex);
                        System.out.println("Item deleted successfully!");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
