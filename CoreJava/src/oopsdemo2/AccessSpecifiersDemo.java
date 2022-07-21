package oopsdemo2;

import oopsdemo1.Bicycle;

class Test {
	int a; // default variable (accessed only in same package)
	private int b; // private variable
	protected int c; // accessed in sub class
	public int d;
	
	public Test(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		d = 500;
	}

	public void display() { // public method{
		System.out.println("Private Variable:" + b);
	}
}

class Test2 extends Test{

    public Test2(int a, int b, int c) {
        super(a, b, c);   
    }
    
    public void display() {  // public method
        System.out.println("Protected Variable:"+c);
    }
    
    void print() { //default method
        System.out.println("Hello from Default Method");
    }
    
    
  //access public method of oopsdemo1.Bicycle
    
   
    //access default method of oopsdemo1.Bicycle - Compiler Error
    //sportsBicycle.applyBrake();
    
}

public class AccessSpecifiersDemo {

	public static void main(String[] args) {

		Test t1=new Test(100,200,300);
        t1.display();
        
        //t1.b=50; //compiler error. cannot access private variable
        
        System.out.println("Defaut Variable :"+t1.a);
        
       
        Test2 t2=new Test2(100,200,300);
        t2.display();

        Bicycle sportsBicycle =new Bicycle();
        
        sportsBicycle.startCycling();	//as startCycling is a default method
        //sportsBicycle.applyBrake();	//compile error-->as applyBreak is default, it can be acccessible in that package itself
	}

}





