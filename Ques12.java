package Assignment1;

public class Ques12 {

	static String hash(String str) {
		if(str.length()== 1)
			return str;
		
		String ans= hash(str.substring(1));				//small problem
		if(str.charAt(0)== ans.charAt(0))
			ans= ans.charAt(0)+"#"+ans.substring(1);			//not str.charAT(0)+"#"+str.substring(2), as str don't store previous changes
		else
			ans= str.charAt(0)+ans;
		return ans;
	}
	
	static void hash(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
			
	}
	
	public static void main(String[] args) {
		System.out.println(hash("aabbcc"));
	}

}
