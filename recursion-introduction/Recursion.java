
public class Recursion {
	static public long factorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException(" number can't be a negative");
		}
		if(n<=1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	/**
	 * 
	 * @param a - any number (positive or negative)
	 * @param b - any positive number or zero (throwing IllegalArgumentException in the case b<0)
	 * @return a^b
	 * requirements:
	 * 1. No cycles
	 * 2. Only arithmetic operations either + or -
	 * 3. Additional methods should apply the #1 and #2 requirements
	 * 4. No additional static fields
	 */
	static public long pow(int a, int b) {
		if(b<0) {
			throw new IllegalArgumentException(" power can't be a negative");
		}
		if(b==0) {
			return 1;
		}
		if(a<0&&isEven(b)) {
			a=-a;
		}
		
		return multiply(a, pow(a, b - 1));
	}
	static public long multiply(long x, long y)
    {
        if (y == 0) {
        	return 0;
        }
        return (x + multiply(x, y - 1));
       
    }
	public static boolean isEven(int b) {
		//[YG] very complicated. better to use regular b % 2
		if(b==1) {
			return false;
		}
		if(b==0) {
			return true;
		}
		return isEven(b-2);
	}
	
	
	/**
	 * 
	 * @param array
	 * @return sum of the array's elements
	 * requirements:
	 * 1. No cycles
	 * 2. Additional methods should apply the requirement #1
	 */
	static public long sum(int[] array) {
	
		return sum(0,array);
	}
	private static long sum(int firstIndex, int[] array) {
		return firstIndex<array.length?array[firstIndex]+sum(firstIndex+1,array):0;
	}
	/**
	 * 
	 * @param x
	 * @return x^2
	 * requirements:
	 * 1. No cycles
	 * 2. Allowed only operators + or -
	 * 3. No additional methods
	 * 4. No static fields
	 */
	public static int square(int x) {
		if(x<0) {
			x= -x;
		}
		if(x==1) {
			return 1;
		}
		return x+square(x-1)+(x-1);
	}
	public static boolean isSubstring(String str, String substr) {
		//TODO write function
		//boolean isSubstring (String str, String substr)
		//that returns true if a given 'substr' is indeed the substring of a given 'string'.
		//Challenges: 1. To apply only following methods of the class String:
		//charAt(int ind); String substring(int ind); int length(); 2. No cycles;
		return false;
	}
}
