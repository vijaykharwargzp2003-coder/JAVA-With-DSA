import java.util.*;
public class ArraysCC11 {
    public static int buyAndSellStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){ //profit
                int profit= prices[i] - buyPrice; //Today`s price
                maxProfit = Math.max(maxProfit,profit);
            }else{
              buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices [] = {7, 1, 5, 3, 6, 4}; //0(n) Time complexity
        System.out.println( buyAndSellStock(prices));
    }
}
