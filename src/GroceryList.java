public class GroceryList {

    public static double getTotalCost (double[] groceryPrices) {
        double totalCost = 0.0;

        for (int i = 0; i < groceryPrices.length; i++) {
            totalCost += groceryPrices[i];
        }

        return totalCost;
    }

    public static double getMostExpensiveItemCost(double[] groceryPrices) {
        // We can set the maxCost initially to the first item without an IndexOutOfBounds error because we can assume there is at least one item in the array.
        double maxCost = groceryPrices[0];

        for (int i = 0; i < groceryPrices.length; i++) {
            if (groceryPrices[i] > maxCost) {
                maxCost = groceryPrices[i];
            }
        }

        return maxCost;
    }

    public static double getLeastExpensiveItemCostHigherThanOneTwenty(double[] groceryPrices) {
        double maxCost = groceryPrices[0];
        for (int i = 0; i < groceryPrices.length; i++) {
            if ((maxCost > groceryPrices[i]) && (groceryPrices[i] >= 1.20)) {
                maxCost = groceryPrices[i];
            }
        }
        return maxCost;
    }

    public static int getNumAllergicItems(String[] groceryList) {
        int numAllergicItems = 0;

        for (int i = 0; i < groceryList.length; i++) {
            if (groceryList[i].length() > 5) {
                numAllergicItems++;
            }
        }

        return numAllergicItems;
    }

    public static boolean hasSpecialItem(double[] groceryPrices) {

        


        return false;
    }

    public static void main(String[] args) {
        double[] groceryPrices = {10.0, 12.3, 1.11, 1.21, 8.45, 2.43};

        System.out.println(getTotalCost(groceryPrices));

        double[] unlikelyGroceryPrices = {100.23, -100.23, 0.0, -78.54};
         System.out.println(getTotalCost(unlikelyGroceryPrices));

        System.out.println(getMostExpensiveItemCost(groceryPrices));

        System.out.println(getLeastExpensiveItemCostHigherThanOneTwenty(groceryPrices));

        String[] groceryList = {"apple", "milk", "banana", "bananas", "chocolate"};

        System.out.println(getNumAllergicItems(groceryList));

        double[] groceryListPrice = {10.0, 89.9, 8.99, 2.34};
        System.out.println(hasSpecialItem(groceryListPrice));
    }
}
