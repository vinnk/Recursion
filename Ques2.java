package Assignment1;

public class Ques2 {

	static int count0(int num) {
		if(num==0)					//termination case
			return 0;
		if(num%10 == 0)					//business logic
			return 1 + count0(num/10);	//small problem
		else
			return count0(num/10);
	}
	
	static void count0(int num, int count) {
		if(num==0) {
			System.out.println(count);
			return;
		}
		if(num%10==0)
			count0(num/10, ++count);//and not count++, as it will use the current val and then increment 
		else
			count0(num/10, count);
	}
	
	public static void main(String[] args) {
		count0(1800040, 0);
		System.out.println(count0(104002));
	}

}
