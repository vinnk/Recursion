package Assignment1;

public class Ques5 {

	static boolean isPrime(int num,int i) {
		if(i==num/2) 
			return true;
		if(num%i== 0)
			return false;
		else 
			return isPrime(num, ++i);
	}
	
	static void isPrime(int num, int i, boolean ans) {
		if(i==num/2) {									//base case or termination case
			System.out.println(ans);
			return;
		}
		if(num%i==0)									//business logic
			isPrime(num, ++i, false);					//small problem
		else
			isPrime(num, ++i, ans);
	}
	
	public static void main(String[] args) {
		isPrime(10, 2, true);
		
		if(isPrime(13,2))
			System.out.println("num is prime");
		else
			System.out.println("num is not prime");
	}

}
