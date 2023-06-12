package assignment4;
import java.util.*;

public class MazePathProblem {

	static void maze(int R, int C, int i, int j, String ans){
		if(i>R || j>C)			//as left and up moved are not defined
			return;
		if(i==R && j==C) {							//base case
			System.out.println(ans);
			return;
		}
		maze(R, C, i+1, j, ans+"R");			//small problem
		maze(R, C, i, j+1, ans+"C");			//small problem
		
	}
	
	static ArrayList<String> maze(int R, int C, int i, int j){
		if(i==R && j==C) {
			ArrayList<String> list= new ArrayList<>();
			list.add("");
			return list;
		}
		if(i>R || j>C) {					//as left and up moves are not defined for this method
			ArrayList<String> list= new ArrayList<>();
			return list;
		}
		
		ArrayList<String> result= new ArrayList<>();
		ArrayList<String> down= maze(R, C, i+1, j);
		for(String s : down)
			result.add("D"+s);
		
		ArrayList<String> right= maze(R, C, i, j+1);
		for(String s : right)
			result.add("R"+s);
		
		return result;
	}
	
	static void mazeDiagonal(int R, int C, int i, int j, String ans){
		if(i>R || j>C)			//as left and up moved are not defined
			return;
		if(i==R && j==C) {							//base case
			System.out.println(ans);
			return;
		}
		mazeDiagonal(R, C, i+1, j, ans+"R");			//small problem
		mazeDiagonal(R, C, i, j+1, ans+"C");			//small problem
		mazeDiagonal(R, C, i+1, j+1, ans+"I");
		
	}
	
	static ArrayList<String> mazeDiagonal(int R, int C, int i, int j){
		if(i==R && j==C) {
			ArrayList<String> list= new ArrayList<>();
			list.add("");
			return list;
		}
		if(i>R || j>C) {					//as left and up moves are not defined for this method
			ArrayList<String> list= new ArrayList<>();
			return list;
		}
		
		ArrayList<String> result= new ArrayList<>();
		ArrayList<String> down= mazeDiagonal(R, C, i+1, j);
		for(String s : down)
			result.add("D"+s);									//as while backtracking, the previous move are added before the returned value
		
		ArrayList<String> right= mazeDiagonal(R, C, i, j+1);
		for(String s : right)
			result.add("R"+s);
		
		ArrayList<String> diagonal= mazeDiagonal(R, C, i+1, j+1);
		for(String s : diagonal)
			result.add("I"+s);
		
		return result;
	}
	
	public static void main(String[] args) {
		String ans= "";
		
		maze(2,2,0,0,ans);
		System.out.println("\n"+maze(2,2,0,0)+"\n");
		
		mazeDiagonal(2,2,0,0,ans);
		System.out.println("\n"+mazeDiagonal(2,2,0,0));
	}

}
