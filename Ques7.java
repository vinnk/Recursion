package Assignment1;

public class Ques7 {

	static int reverse(int num, int len) {
		if(num/10==0)
			return num%10;
		return (num%10)*(int)Math.pow(10, len-1) + reverse(num/10, len-1); 
	}
	
	static void reverse(int num, int len, int rev) {
		if(num==0) {
			System.out.println(rev);
			return;
		}
		rev= rev + (num%10)*(int)Math.pow(10, len-1);
		reverse(num/10, len-1, rev);
	}
	
	public static void main(String[] args) {
		reverse(369,3,0);
		System.out.println(reverse(123, 3));
	}

}
