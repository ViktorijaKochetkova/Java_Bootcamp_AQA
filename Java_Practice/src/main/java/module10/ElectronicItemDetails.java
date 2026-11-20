package module10;

import java.util.HashMap;

/**
 * This class stores electronic items and their prices
 */

public class ElectronicItemDetails {

    /**
     * Finds the price of an item by its name
     * @param itemHashMap map of items and prices
     * @param name name of the item
     * @return price of the item
     */
    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        return itemHashMap.get(name);
    }

    /**
     * Creates electronic items and prints the TV price
     * @param args command line arguments
     */
    public static void main(String[] args) {

        HashMap<String, Double> itemHashMap = new HashMap<>();

        itemHashMap.put("TV", 786.55);
        itemHashMap.put("Refrigerator", 1247.99);
        itemHashMap.put("Washing Machine", 555.00);
        itemHashMap.put("Laptop", 1093.50);

        ElectronicItemDetails items = new ElectronicItemDetails();

        System.out.println("Price of TV is " + items.returnPriceOfItem(itemHashMap, "TV"));

    }
}
