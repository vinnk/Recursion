package assignment3;

public class Ques8 {

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
	
	static void oddPyramid(int row, int constant) {
		if(row==0)
			return;
		space(row-1);
		star(2*(constant-row)+1);
		System.out.println();
		
		oddPyramid(row-1,constant);
	}
	
	public static void main(String[] args) {
		oddPyramid(5,5);
	}

}
