package assignment2;

public class Ques4 {

	static double[] employee(double[] salary, int i, int count) {
		if(i==salary.length) {
			double[] result= new double[count];
			return result;
		}
		double[] result= employee(salary,i+1,count+1);
		double tax= 0.1*salary[i];
		//tax+= salary[i];
		result[i]= salary[i] + tax;
		return result;
	}
	
	public static void main(String[] args) {
		double[] salary= {10000, 348897, 42300};
		double[] result= employee(salary,0,0);
		System.out.println("salary+tax: ");
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+"\t");;
		}
	}

}
