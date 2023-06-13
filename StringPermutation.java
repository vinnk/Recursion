package assignment4;
import java.util.*;

public class StringPermutation {

	static ArrayList<String> perm(String str){
		if(str.length()==0) {									//termination case
			ArrayList<String> list= new ArrayList<>();
			list.add("");
			return list;
		}
		
		ArrayList<String> ans= new ArrayList<>();
		ArrayList<String> list= perm(str.substring(1));			//small problem
		for(String s : list) {									//business logic
			for(int i=0;i<=s.length();i++) {
				StringBuilder sb= new StringBuilder(s);
				sb.insert(i, str.charAt(0));
				ans.add(sb.toString());
			}
		}
		return ans;
	}
	
	static void perm(String str, String ans) {						//void return type needs an additional argument to store the result
		if(str.length()==0) {					//termination case
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<=ans.length();i++) {				//business logic
			StringBuilder sb= new StringBuilder(ans);
			sb.insert(i, str.charAt(0));
			perm(str.substring(1), sb.toString());		//small problem
		}
	}
	
	public static void main(String[] args) {
		perm("abc", "");
		
		System.out.println("\n"+perm("abc"));
	}

}
