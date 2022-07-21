package oopsdemo1;

public class RegalBookShop {

	public static void main(String[] args) {
		
		BookStore bs1 =new BookStore();	//create instance of BookStore
		BookStore hello = new BookStore();
		
		bs1.inputBookDetails();	//call BookStore class methods
		bs1.displayBookDetails();
		
		hello.inputBookDetails();
		hello.displayBookDetails();

	}

}
