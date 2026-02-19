import java.util.Scanner;

/**
 * GroceryManagement
 *
 * This program manages grocery inventory using parallel arrays.
 * It allows viewing inventory and restocking items using a menu.
 */
public class GroceryManagement {

    /**
     * Main method that initializes arrays and runs the menu system.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Sample data
        itemNames[0] = "Apple";
        itemPrices[0] = 1.50;
        itemStocks[0] = 20;

        itemNames[1] = "Milk";
        itemPrices[1] = 3.99;
        itemStocks[1] = 10;

        itemNames[2] = "Bread";
        itemPrices[2] = 2.49;
        itemStocks[2] = 15;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Grocery Management Menu =====");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            if (choice == 1) {

                printInventory(itemNames, itemPrices, itemStocks);

            } else if (choice == 2) {

                System.out.print("Enter item name to restock: ");
                String target = scanner.nextLine();

                System.out.print("Enter amount to add: ");
                int amount = scanner.nextInt();

                restockItem(itemNames, itemStocks, target, amount);

            } else if (choice == 3) {

                System.out.println("Exiting program...");
                break;

            } else {

                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    /**
     * Prints all non-empty inventory items.
     *
     * @param names  Array of item names
     * @param prices Array of item prices
     * @param stocks Array of item stock quantities
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {

        for (int i = 0; i < names.length; i++) {

            if (names[i] != null) {

                System.out.println("Item: " + names[i]);
                System.out.println("Price: $" + prices[i]);
                System.out.println("Stock: " + stocks[i]);
                System.out.println("----------------------");
            }
        }
    }

    /**
     * Restocks an item if found in the inventory.
     *
     * @param names  Array of item names
     * @param stocks Array of item stocks
     * @param target Name of item to restock
     * @param amount Amount to add to stock
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {

        boolean found = false;

        for (int i = 0; i < names.length; i++) {

            if (names[i] != null && names[i].equalsIgnoreCase(target)) {

                stocks[i] += amount;
                System.out.println("Item restocked successfully.");
                found = true;
                break;
            }
        }

        if (!found) {

            System.out.println("Item not found.");
        }
    }
}
