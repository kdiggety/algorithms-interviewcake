package klewis3.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import klewis3.algorithms.fib.FibUtils;
import klewis3.algorithms.stocks.StockTrader;

@SpringBootTest
class ApplicationTest {
	private static Logger logger = Logger.getLogger(ApplicationTest.class.getName());
	
	@Test
	void contextLoads() {
	}

	@Test
	void testFib1() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			FibUtils.fib(-4); 
	    });
	}
	
	@Test
	void testFib2() {
		final Integer rc = FibUtils.fib(10);
//		logger.info(String.valueOf(rc));
		assertEquals(rc, 34);
	}
	
	@Test
	void testFib3() {
		final Integer rc = FibUtils.fib(3);
//		logger.info(String.valueOf(rc));
		assertEquals(rc, 1);
	}
	
	@Test
	void testStocks1() {
		final Integer rc = StockTrader.getMaxProfit_n2(new int[] {10,7,5,8,11,9});
		logger.info(String.valueOf(rc));
		assertEquals(rc, 6);
	}
	
	@Test
	void testStocks2() {
		final Integer rc = StockTrader.getMaxProfit_n(new int[] {10,7,5,8,11,9});
		logger.info(String.valueOf(rc));
		assertEquals(rc, 6);
	}
}
