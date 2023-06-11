package assignment3;

public class Ques6 {
    
	static void space(int n) {
		if(n==0)
			return;
		System.out.print(" ");
		space(n-1);
	}
	
	static void star(int n) {
		if(n==1)
			return;
		System.out.print("*");
		star(n-1);
	}
	
	static void revRightPyramid(int row, int constant) {
		if(row==0)
			return;
		space(constant-row);
		star(row);
		System.out.println();
		
		revRightPyramid(row-1, constant);
	}
	
	public static void main(String[] args) {
		revRightPyramid(5,5);
	}

}
