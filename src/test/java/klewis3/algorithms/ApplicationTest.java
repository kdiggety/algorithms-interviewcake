package klewis3.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import klewis3.algorithms.utils.FibUtils;

@SpringBootTest
class ApplicationTest {
	private static Logger logger = Logger.getLogger(ApplicationTest.class.getName());
	
	@Test
	void contextLoads() {
	}

	@Test
	void test1() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			FibUtils.fib(-4); 
	    });
	}
	
	@Test
	void test2() {
		final Integer rc = FibUtils.fib(10);
		logger.info(String.valueOf(rc));
		assertEquals(rc, 34);
	}
	
	@Test
	void test3() {
		final Integer rc = FibUtils.fib(3);
		logger.info(String.valueOf(rc));
		assertEquals(rc, 1);
	}
}
