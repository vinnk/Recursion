package assignment3;

public class Ques14 {
	static int num= 1;
	
	static void numPyramid(int row, int col) {
		if(row==0)
			return;
		if(row>col) {
			numPyramid(row,col+1);
			System.out.print(num++);
		}
		else {
			numPyramid(row-1,0);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		numPyramid(4,0);
	}

}
