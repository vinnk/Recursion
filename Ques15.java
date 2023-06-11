package assignment3;

public class Ques15 {

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
	
	static void invePyramid(int row, int constant) {
		if(row==0)
			return;
		space(constant-row);
		star(row*2-1);
		System.out.println();
		
		invePyramid(row-1,constant);
	}
	
	public static void main(String[] args) {
		invePyramid(5,5);
	}

}
