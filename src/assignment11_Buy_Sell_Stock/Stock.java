package assignment11_Buy_Sell_Stock;

public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	
		

	}
	
	public static int maxProfit(int[] prices) {
		int min=prices[0];
		int maxProfit=0;
		for(int i =1;i<prices.length;i++) {
			if(min>prices[i]) {
				min = prices[i];
			}
			else {
				int curr_profit = prices[i]-min;
				maxProfit=Math.max(maxProfit, curr_profit);
			}
			
		}
		System.out.println("min:"+min);
		
		return maxProfit;
		
	}

}



