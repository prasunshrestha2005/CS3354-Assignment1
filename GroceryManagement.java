/**
 * Restocks item if searched.
 * Adds stock once item is found.
 * If not found, prints "Item not found."
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
