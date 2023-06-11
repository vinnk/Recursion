package assignment3;

public class Ques1 {
	static final int side= 5;
	static void square(int row,int col) {
		if(row==0)
			return;
	
		if(col>0) {
			System.out.print("*");
			square(row,col-1);
		}
		else {
			System.out.println();
			square(row-1,side);
		}
	}
	
	public static void main(String[] args) {
		square(side,side);
	}

}
