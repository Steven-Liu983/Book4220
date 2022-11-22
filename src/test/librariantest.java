/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

/**
 * @author kyleg
 *
 */
public class librariantest {
	
	//precondition db connection ok
	 private final librarian lib=new librarian();
	 int id=6;
	 String name="wangwu";
	 String password="1234";
	 String email="w02@gmail.com";
	 String address="123 riverside";
	 String city="windsor";
	 String contact="12345677";
	 void test1() {
		 	assertEquals("update successfully",lib.add(id, name, password, email, address, city, contact));
	 }
	 void test2() {
		 	assertEquals("id missing",lib.add( name, password, email, address, city, contact));
	 }
	 void test3() {
		 	assertEquals("name missing",lib.add(id, password, email, address, city, contact));
	 }
	 
	 
	 
}
