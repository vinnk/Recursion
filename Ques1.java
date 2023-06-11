package Assignment1;

public class Ques1 {
	
	static long powNum(int num, int pow) {
		if(pow==1)							//base case or termination case
			return num;
		return num * powNum(num, pow-1);		//business logic, small problem
	}
	
	static void powNum(int num, int pow, long result) {
		if(pow==0) {
			System.out.println(result);
			return;
		}
		powNum(num, pow-1, num*result);
	}
		
	public static void main(String[] args) {
		powNum(5,2,1);
		System.out.println(powNum(2,3));

	}

}
