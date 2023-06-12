package assignment4;

import java.util.*;

public class diceGame {

	static ArrayList<String> dice(int goal, int sum, String ans, ArrayList<String> list){
		if(sum>goal) 							//base case
			return list;
		if(sum==goal) {
			list.add(ans);
			return list;
		}
		dice(goal, sum+1, ans+"1", list);		//small problem
		dice(goal, sum+2, ans+"2", list);
		dice(goal, sum+3, ans+"3", list);
		dice(goal, sum+4, ans+"4", list);
		dice(goal, sum+5, ans+"5", list);
		dice(goal, sum+6, ans+"6", list);
		
		return list;
	}
	
	public static void main(String[] args) {
		String ans= "";
		ArrayList<String> list= new ArrayList<>();
		System.out.println(dice(5,0,ans,list));
	}

}
