package assignment5;

public class PowerOfThree {

	static boolean pow(int num) {
		if(num==1)
			return true;
		if(num%3!=0)				//termination case
			return false;
		return pow(num/3);			//small problem, if the num is divisible by three then the quotient can't have decimal values to lose
	}
	
	public static void main(String[] args) {
		if(pow(12))
			System.out.println("The number is a power of three.");
		else
			System.out.println("The number is not a power of three.");
	}

}
