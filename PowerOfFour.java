package assignment5;

public class PowerOfFour {

	static boolean pow(int num) {
		if(num==1)
			return true;
		if(num%4!=0)
			return false;
		return pow(num/4);
	}
	
	public static void main(String[] args) {
		if(pow(64))
			System.out.println("The number is a power of four.");
		else
			System.out.println("The number is not a power of four.");
	}

}
