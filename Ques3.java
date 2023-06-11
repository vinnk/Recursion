package Assignment1;

public class Ques3 {

	static int sum(int num) {
		if(num==1)				//termination case
			return 1;
		return num + sum(num-1);	//small problem
	}
	
	static void sum(int num, int ans) {
		if(num==0) {
			System.out.println(ans);
			return;
		}
		sum(num-1, ans+num);
	}
	
	public static void main(String[] args) {
		sum(4,0);
		System.out.println(sum(3));
	}

}
