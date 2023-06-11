package assignment3;

public class Ques13 {

	static void space(int n) {
		if(n==0)
			return;
		System.out.print(" ");
		space(n-1);
	}
	
	static void star(int n) {
		if(n==0)
			return;
		System.out.print("*");
		star(n-1);
	}
	
	static void leftPascal(int row, int constant) {
		if(row==0)
			return;
		space(row-1);
		star(constant-row+1);
		System.out.println();
		
		leftPascal(row-1,constant);
		
		if(row==1)
			return;
		space(row-1);
		star(constant-row+1);
		System.out.println();
	}
	
	public static void main(String[] args) {
		leftPascal(5,5);
	}

}
