/**
 * GroceryManagement
 *
 * Base structure with inventory display feature.
 */

public class GroceryManagement {

    /**
     * Prints all non-null inventory items.
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {

        for (int i = 0; i < names.length; i++) {

            if (names[i] != null) {

                System.out.println(
                        "Item: " + names[i] +
                        " | Price: $" + prices[i] +
                        " | Stock: " + stocks[i]
                );

            } else {
                // required if-else
            }
        }
    }

    public static void main(String[] args) {

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Milk";
        itemPrices[0] = 2.99;
        itemStocks[0] = 10;
    }
}
