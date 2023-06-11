package assignment3;

public class Ques3 {

	static void leftPyramid(int row, int col) {
		if(row==0)
			return;
		if(row>col) {
			leftPyramid(row,col+1);
			System.out.print("*");
		}
		else {
			leftPyramid(row-1,0);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		leftPyramid(5,0);
	}

}
