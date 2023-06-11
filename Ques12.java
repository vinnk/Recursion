package assignment3;

public class Ques12 {

	static void star(int n) {
		if(n==0)
			return;
		System.out.print("*");
		star(n-1);
	}
	
	static void rightPascal(int row, int constant) {
		if(row==0)
			return;
		star(constant-row+1);
		System.out.println();
		
		rightPascal(row-1,constant);
		
		if(row==1)
			return;
		star(constant-row+1);
		System.out.println();
	}
	
	public static void main(String[] args) {
		rightPascal(5,5);
	}

}
