package oopsdemo1;
//Program to demonstrate constructors in Java
class Language{
	
	private String s;
	private int version;
	
	
	Language(){						//implicit constructor
		System.out.println("I'm implicit constructor");
		s="Python";
		System.out.println("hello from : "+s);
	}
	
	Language(String lang){ 			//parameterized constructor with 1 arg
		System.out.println("i am parameterizd constructor with 1 Arguement");
		this.s=lang;
		System.out.println("hello from : "+s);
	}
	
	Language(String lang,int ver)// Parameterized Constructor with 2 Args
  {
      System.out.println("Iam a Parameterized Constructor with 2  Arguements");
      this.s=lang;
      this.version=ver;
      System.out.println("Hello from : "+s+" V."+version);
  }}
	public class ConstructorDemo {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Language l1=new Language();
			Language l2=new Language("Java");
			Language l3=new Language("Ruby",5);
		}

	}
