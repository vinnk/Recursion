package assignment3;

public class Ques4 {

	static void invertedHalfPy(int row, int col) {
		if(row==0)
			return;
		if(row>col) {
			System.out.print("*");
			invertedHalfPy(row,col+1);
		}
		else {
			System.out.println();
			invertedHalfPy(row-1,0);
		}
	}
	
	public static void main(String[] args) {
		invertedHalfPy(5,0);
	}

}
