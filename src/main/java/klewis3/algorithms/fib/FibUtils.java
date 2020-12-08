package klewis3.algorithms.fib;

/**
 * @author klewis3
 *
 */
public class FibUtils {
	/**
	 * @param n the nth number in the sequence to return
	 * @return
	 */
	public static final Integer fib(Integer n) {
		if (n < 0) throw new IllegalArgumentException(String.format("%d is less than zero!", n));

		// Default to the n=0 number in the sequence
		Integer rc = 0;
		
		// Do work if we're looking for the n >= 3 number in the sequence
		if (n > 3) {
			Integer rc_1 = 1, rc_2 = 1; 
			rc = 2;
			for (int i = 4; i <= n; i++) {
				rc = rc_1 + rc_2;
				rc_2 = rc_1;
				rc_1 = rc;
			}
		} else if (n > 0) { // Special case for the n=1 or n=2
			rc = 1;
		} else {
			// Do nothing because we've defaulted to zero!
		}
		return rc;
	}
}
