/**
     * Displays the inventory of items that are not null.
     * * @param names   array of item names
     * @param prices  array of item prices
     * @param stocks  array of item stock quantities
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        System.out.println("\n--- Current Inventory ---");
        // Logic: Use a for loop to iterate through the arrays 
        for (int i = 0; i < names.length; i++) {
            // Requirement: Use an if-else statement to only print non-empty slots 
            if (names[i] != null) {
                System.out.println("Item: " + names[i] + 
                                   " | Price: $" + prices[i] + 
                                   " | Stock: " + stocks[i]);
            } else {
                // The assignment requires an if-else, even if the else does nothing 
                // We can just leave this empty or use it for debugging
            }
        }
    }
