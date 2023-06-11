package assignment3;

public class Ques2 {
	static final int side= 5;
	static void hollowSquare(int row, int col){
		if(row==0)
			return;
		if(col>0) {
			if(col==side || col==1 || row==side || row==1)
				System.out.print("*");
			else
				System.out.print(" ");
			hollowSquare(row,col-1);
		}
		else {
			System.out.println();
			hollowSquare(row-1,side);
		}
	}
	
	public static void main(String[] args) {
		hollowSquare(side,side);
	}

}
