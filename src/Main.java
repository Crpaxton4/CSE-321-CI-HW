
/**
 * @author Chris
 *
 */
public class Main {
	
	public int fib(int n) {
		
		int[] memo = new int[n+1];
		memo[0] = 0;
		memo[1] = 1;
		
		for(int i = 2; i <=n; i++) {
			memo[i] = memo[i-1] + memo[i-2];
		}
		
		return memo[n];
	}
	
	public String reverseString(String s) {		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		return sb.reverse().toString();
	}
	
	public int countPositive(int[] arr) {
		int count = 0;
		for(int i : arr) {
			if(i > 0) {
				count++;
			}
		}
		return count;
	}
}
