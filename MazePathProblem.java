package assignment4;
import java.util.*;

public class MazePathProblem {

	static ArrayList<String> maze(int R, int C, int i, int j, String ans, ArrayList<String> list){
		if(i>R || j>C || i<0 || j<0)			//as left and up moved are not defined
			return list;
		if(i==R && j==C) {							//base case
			list.add(ans);
			return list;
		}
		maze(R, C, i+1, j, ans+"R", list);			//small problem
		maze(R, C, i, j+1, ans+"C", list);			//small problem
		
		return list;
	}
	
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		String ans= "";
		
		System.out.println(maze(2,2,0,0,ans,list));
	}

}
