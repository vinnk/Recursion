package assignment2;

public class Ques2 {

	static String[] caps(String[] str, int i, int count) {
		if(i==str.length) {
			String[] ans= new String[count];
			return ans;
		}
		String[] ans= caps(str,i+1,count+1);
		ans[i]= str[i].toUpperCase();
		return ans;
	}
	
	static void caps(String[] str, int i, String[] ans) {
		if(i==str.length) {
			System.out.println("Result: ");
			for(int j=0;j<ans.length;j++) {
				System.out.print(ans[j]+"\t");
			}
			return;
		}
		ans[i]= str[i].toUpperCase();
		caps(str,i+1,ans);
	}
	
	public static void main(String[] args) {
		String[] arr= {"abb","sDf","MM","NyC","piI"};
		String[] result= new String[arr.length];
		
		caps(arr,0,result);
		
		System.out.println("\nString array after caps: ");
		String[] ans= caps(arr,0,0);
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+"\t");
		}
	}

}
