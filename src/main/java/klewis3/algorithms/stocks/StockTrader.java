package klewis3.algorithms.stocks;

import java.util.logging.Logger;

public class StockTrader {
	private static Logger logger = Logger.getLogger(StockTrader.class.getName());
	
	// Ths cost of this method is O(n^2)
	public static final int getMaxProfit_n2(int[] stockPrices) {
		int maxProfit = 0;
		for (int i = 0; i < stockPrices.length; i++) {
			int buyPrice = stockPrices[i];
			for (int j = i + 1; j < stockPrices.length; j++) {
				int sellPrice = stockPrices[j];
				int currentProfit = sellPrice - buyPrice;
				if (currentProfit > maxProfit) {
					maxProfit = currentProfit;
				}
			}
		}
		
		return maxProfit;
	}
	
	// Ths cost of this method is O(n)...I hope
	public static final int getMaxProfit_n(int[] stockPrices) {
		int maxProfit = 0;
		
		int lowPrice = stockPrices[0];		
		for (int i = 1; i < stockPrices.length; i++) {
			int currentPrice = stockPrices[i];
			logger.info(String.format("Current Price: %d", currentPrice));
			
			int currentProfit = 0;
			if (currentPrice < lowPrice) {
				lowPrice = currentPrice;
				logger.info(String.format("New Low Price: %d", lowPrice));
			} else {
				currentProfit = currentPrice - lowPrice;
				logger.info(String.format("Current Profit: %d", currentProfit));
			}
			
			if (currentProfit > maxProfit) {
				logger.info(String.format("New High Price: %d", currentPrice));
				maxProfit = currentProfit;
				logger.info(String.format("New Max Profit: %d", maxProfit));
			}
		}
		
		return maxProfit;
	}
}
