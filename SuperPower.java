package assignment5;

public class SuperPower {

	static long pow(int[] n, int i) {
		if(i==n.length-1)
			return n[i];
		return n[i]*10 + pow(n,++i);
	}
	
	static int supPow(int num, int[] power) {
		return (int)(Math.pow(num, pow(power,0)) % 1337);
	}
	
	public static void main(String[] args) {
		int[] pow= {1,0};
		System.out.println(supPow(2,pow));
	}

}
