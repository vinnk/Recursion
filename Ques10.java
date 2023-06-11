package assignment3;

public class Ques10 {

	static void space(int n) {
		if(n==0)
			return;
		System.out.print(" ");
		space(n-1);
	}
	
	static void diagonalLine(int row) {
		if(row==0)
			return;
		space(row-1);
		System.out.println("*");
		
		diagonalLine(row-1);
	}
	
	public static void main(String[] args) {
		diagonalLine(5);
	}

}
