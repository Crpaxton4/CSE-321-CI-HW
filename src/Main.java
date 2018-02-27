
/**
 * @author Chris
 *
 */
public class Main {

	
	/**
	 * @param a
	 * @param b
	 * @return greater of a and b
	 */
	public int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	/**
	 * @param n
	 * @return the nth number in the Fibonacci sequence
	 */
	public int fib(int n) {
		int[] memo = new int [n+1];
		memo[0] = 0;
		memo[1] = 1;
		
		for(int i = 2; i < n; i++) {
			memo[i] = memo[i-1] + memo[i-2];
		}
		return memo[n-1];
	}

}
