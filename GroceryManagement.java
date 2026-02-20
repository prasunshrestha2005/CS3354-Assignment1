import java.util.Scanner;

/**
 * Grocery management system using parallel arrays for names, prices, and
 * stocks.
 */
public class GroceryManagement {

    /**
     * Program entry point. Provides a menu to view inventory, restock items, or
     * exit.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Sample Data
        itemNames[0] = "Milk";
        itemPrices[0] = 2.99;
        itemStocks[0] = 10;

        itemNames[1] = "Bread";
        itemPrices[1] = 1.99;
        itemStocks[1] = 20;

        itemNames[2] = "Eggs";
        itemPrices[2] = 3.49;
        itemStocks[2] = 15;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Grocery Menu ===");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                printInventory(itemNames, itemPrices, itemStocks);
            } else if (choice == 2) {
                System.out.print("Enter item name to restock: ");
                String target = scanner.nextLine();

                System.out.print("Enter amount to add: ");
                int amount = scanner.nextInt();
                scanner.nextLine(); // consume newline

                restockItem(itemNames, itemStocks, target, amount);
            } else if (choice == 3) {
                System.out.println("Exiting program.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    /**
     * Displays the inventory of items that are not null.
     *
     * @param names  array of item names
     * @param prices array of item prices
     * @param stocks array of item stock quantities
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        System.out.println("\n--- Current Inventory ---");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println("Item: " + names[i] +
                        " | Price: $" + prices[i] +
                        " | Stock: " + stocks[i]);
            } else {
                // empty slot — skip
            }
        }
    }

    /**
     * Restocks an item by name.
     * Adds stock once item is found.
     * If not found, prints "Item not found."
     *
     * @param names  array of item names
     * @param stocks array of item stock quantities
     * @param target item name to restock
     * @param amount amount to add
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] = stocks[i] + amount;
                System.out.println("Item restocked. New stock: " + stocks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }
}
