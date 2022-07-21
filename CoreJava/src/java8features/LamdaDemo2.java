package java8features;

public class LamdaDemo2 {

	public static void main(String[] args) {
		
		//isEven,isNegative are the instances for FI.LamdaDemo2NumericTest
		NumericTest isEven=(n) -> (n%2==0);
		NumericTest isNegative =(n) ->(n<0);
       
        System.out.println(isEven.computeTest(7));
        System.out.println(isNegative.computeTest(-1));
       
        //boolean a=(n) -> (n%2==0); //error - lambda expressions should be stored in instance of FI


	}

}
