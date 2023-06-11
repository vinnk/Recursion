package assignment2;

public class Ques1 {

	static int product(int[] arr, int i) {
		if(i==arr.length)
			return 1;
		return arr[i] * product(arr, ++i);
	}
	
	static void product(int[] arr, int i, long ans) {
		if(i==arr.length) {
			System.out.println("Product of the elements: "+ans);
			return;
		}
		product(arr,i+1,ans*arr[i]);								//not ++i as it will change the value for ans*arr[i] before hand
	}
	
	static int[] square(int[] arr,int i, int count) {
		if(i==arr.length) {
			int[] ans= new int[count];
			return ans;
		}
		int[] ans= square(arr,i+1,++count);
		ans[i]= arr[i]*arr[i];
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr= {3,2,10,3};
		int[] ans= square(arr,0,0);
		product(arr,0,1);
		
		System.out.println("Product of all elements of the array: "+product(arr,0));
		
		System.out.println("Square of the array: ");
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+"\t");
		}

	}

}
