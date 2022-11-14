package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

class PersonTest extends TestCase{

	@Test
	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getName());
		assertEquals(3, p1.getMaxBooks());
	}

	@Test
	public void testSetName() {
		Person p2 = new Person();
		p2.setName("Fred");
		assertEquals("Fred", p2.getName());
	}

	@Test
	public void testSetMaxBooks() {
		Person p3 = new Person();
		p3.setMaxBooks(10);
		assertEquals(10, p3.getMaxBooks());
	}
	
	@Test
	public void testToString() {
		Person p4 = new Person();
		p4.setName("John");
		p4.setMaxBooks(7);
		//Test-Driven Development -> lets say we want the toString() method to
		//print out "John (7 books)"
		String testString = "John (7 books max)";
		assertEquals(testString, p4.toString());
	}

}
