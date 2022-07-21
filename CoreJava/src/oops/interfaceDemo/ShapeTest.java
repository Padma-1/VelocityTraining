package oops.interfaceDemo;

public class ShapeTest {

	public static void main(String[] args) {
		
		//programming for interfaces not implementation
		Shape shape = new Circle(10);
		System.out.println("Using interface :"+Shape.LABLE);
		shape.draw();
		System.out.println("Area of circle with radius is :"+shape.getArea());
		
		//switching from one implementation to other easily
		shape=new Rectangle(10,7);
		shape.draw();
		System.out.println("Area of Rectangle is :"+shape.getArea());

	}

}
