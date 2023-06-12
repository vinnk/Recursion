package assignment4;

import java.util.*;

public class diceGame {

	static void dice(int goal, int sum, String ans){
		if(sum>goal) 							//base case
			return;
		if(sum==goal) {
			System.out.println(ans);
			return;
		}
		dice(goal, sum+1, ans+"1");		//small problem
		dice(goal, sum+2, ans+"2");
		dice(goal, sum+3, ans+"3");
		dice(goal, sum+4, ans+"4");
		dice(goal, sum+5, ans+"5");
		dice(goal, sum+6, ans+"6");
	
		/*
		 * for(int d=1;d<=6;d++){
		 * 		dice(goal, sum+d, ans+d);
		 * }
		 */
		
	}
	
	static ArrayList<String> dice(int goal, int sum){
		if(sum==goal) {
			ArrayList<String> list= new ArrayList<>();
			list.add("");
			return list;
		}
		if(sum>goal) {
			ArrayList<String> list= new ArrayList<>();
			return list;
		}
		
		ArrayList<String> ans= new ArrayList<>();
		for(int d=1;d<=6;d++) {
			ArrayList<String> list= dice(goal, sum+d);
			
			for(String s : list) {
				ans.add(s+d);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String ans= "";
		dice(5,0,ans);
		System.out.println("\n"+dice(4,0));
	}

}
