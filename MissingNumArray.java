package assignment5;

public class MissingNumArray {

	static int find(int[] arr, int i, int n) {			//helper method
		if(arr[i]!= n)									//termination condition
			return n;
		return find(arr,++i,n+1);						//small problem 
	}
	
	static int missing(int[] arr, int n) {
		 return find(arr, 0, 1);
	}
	
	public static void main(String[] args) {
		int[] arr= {1,3,4,5};
		System.out.println("Missing number in the array is: "+missing(arr, arr.length));
	}

}
