package Assignment1;

public class Ques10 {

	static int[] search(int[] arr, int i, int val, int count) {
		if(i==arr.length) {
			int[] result= new int[count];
			return result;
		}
		if(arr[i]==val)
			int[] ans= search(arr,++i,val,++count);
		else
			int[] ans= search(arr,++i,val,count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
