package assignment2;

public class Ques3 {

	static int largest(int[] arr, int i) {
		if(i==arr.length)
			return Integer.MIN_VALUE;
		int max= largest(arr,i+1);
		max= Math.max(max, arr[i]);
		return max;
	}
	
	static void largest(int[] arr, int i, int max) {
		if(i==arr.length) {
			System.out.println("Largest element: "+max);
			return;
		}
		max= Math.max(max, arr[i]);
		largest(arr,i+1,max);
	}
	
	public static void main(String[] args) {
		int[] arr= {4,2,7,4,9};
		
		largest(arr,0,Integer.MIN_VALUE);
		
		System.out.println("Largest element: "+largest(arr,0));
	}

}
