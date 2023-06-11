package assignment3;

public class Ques9 {

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
	
	static void fullPyramid(int row, int constant) {
		if(row==0)
			return;
		space(row-1);
		star(2*(constant-row)+1);
		System.out.println();
		
		fullPyramid(row-1,constant);
		
		if(row==1)
			return;
		space(row-1);
		star(2*(constant-row)+1);
		System.out.println();
	}
	
	public static void main(String[] args) {
		fullPyramid(3,3);
	}

}
