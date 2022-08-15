package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.Demo;

public class DemoTest {
	
	//as demo class has static methods, no need to create reference for calling.
	//call static methods with the classname.methodname

	@Before
	public void setUp() throws Exception {
		System.out.println("Before test case");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After test case");
	}

	@Test
	public void testFindMax() {
		System.out.println("Test case to find Max");
		assertEquals(20,Demo.findMax(new int[] {20,2,10,15}));
		assertEquals(-2,Demo.findMax(new int[] {-12,-2,-4,-222}));	
	}

	@Test
	public void testCube() {
		System.out.println("Test case for Cube");
		assertEquals(27,Demo.cube(3));
		
	}

	@Test
	public void testReverseWord() {
		System.out.println("Test case for reversing");
		assertEquals("madam",Demo.reverseWord("madam"));
		
	}

}
