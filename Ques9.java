package Assignment1;

public class Ques9 {

	static int count(int[] arr, int i, int val) {
		if(i==arr.length)
			return 0;
		if(arr[i]==val)
			return 1 + count(arr,++i,val);
		else
			return count(arr,++i,val);
	}
	
	static void count(int[] arr, int i, int val, int result) {
		if(i==arr.length) {
			System.out.println("occurance of "+val+": "+result);
			return;
		}
		if(arr[i]==val)
			count(arr,++i,val,++result);
		else
			count(arr,++i,val,result);
	}
	
	public static void main(String[] args) {
		int[] arr= {3,1,5,2,5,1,1};
		count(arr, 0, 1, 0);
		System.out.println("occurance of 5: "+count(arr,0,5));
	}

}
