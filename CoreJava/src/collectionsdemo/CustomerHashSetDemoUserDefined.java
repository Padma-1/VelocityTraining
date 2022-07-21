package collectionsdemo;

import java.util.HashSet;
import java.util.Set;

//Hash set with user defined objects
public class CustomerHashSetDemoUserDefined {

	Set<Customer> customers; // Declare a hashset of type Customers

	public CustomerHashSetDemoUserDefined() {
		System.out.println("HashSet with Customer Object");
		customers = new HashSet<>();
	}

	void addCustomer() {
		// add new Customer Object to set
		customers.add(new Customer(101, "Arun", "Bengaluru"));
		customers.add(new Customer(102, "Mike", "Newyork"));
		customers.add(new Customer(103, "John", "Sydney"));
		customers.add(new Customer(104, "Hari", "Delhi"));
		customers.add(new Customer(105, "Navi", "Mumbai"));
	}

	void appendCustomer() {
		// add duplicate customer
		/*
		 * HashSet will use the `equals()` & `hashCode()` implementations of the
		 * Customer class to check for duplicates and ignore them
		 */
		customers.add(new Customer(103, "John", "Sydney"));
		customers.add(new Customer(106, "Raj", "Chennai"));
	}

	void displayCustomers() {
		System.out.println(" ********* Customer List *****************");
		for (Customer i : customers) {
			System.out.println(i.getId() + " " + i.getName() + " " + i.getCity());
		}
	}

	public static void main(String[] args) {

		CustomerHashSetDemoUserDefined custHset = new CustomerHashSetDemoUserDefined();

		custHset.addCustomer();
		custHset.appendCustomer();
		custHset.displayCustomers();

	}

}
