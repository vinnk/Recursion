package Assignment1;

public class Ques4 {
	
	static double series(int n) {
		if(n==1)								//termination case
			return 1;
		return n/(Math.pow(n, n)) + series(n-1);		//small problem
	}
	
	static void series(int n, double sum) {
		if(n==0) {
			System.out.println(sum);
			return;
		}
		series(n-1, sum + n/Math.pow(n, n));
	}

	public static void main(String[] args) {
		series(3,0.0d);
		System.out.println(series(4));
	}

}
