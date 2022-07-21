package oops.interfaceDemo;

public interface Shape {
	
	//implicitly public,static,final
	public String LABLE="Shape";
	
	//interface methods are implicitly abstract and public
	void draw();

	public abstract double getArea();
}
