package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class viewlibrarian {

	//precondition db connection ok
		 private final librarian lib=new librarian();
		
		 void test1() {
			 	assertEquals("connection fail",lib.view());
		 }
		 void test2() {
			 assertEquals("get data from database",lib.view());
		 }
		 void test3() {
			 assertEquals("no data in the table",lib.view());
		 }

}
