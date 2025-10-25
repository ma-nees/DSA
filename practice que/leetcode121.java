public class leetcode121 { 

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        leetcode121 solution = new leetcode121();

        // Test case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + solution.maxProfit(prices1)); // Expected 5

        // Test case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit: " + solution.maxProfit(prices2)); // Expected 0

        // Test case 3
        int[] prices3 = {2, 4, 1};
        System.out.println("Max Profit: " + solution.maxProfit(prices3)); // Expected 2

        // Test case 4
        int[] prices4 = {1, 2};
        System.out.println("Max Profit: " + solution.maxProfit(prices4)); // Expected 1
    }
}
 
