package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class issuebooktest {
	 private final librarian lib=new librarian();
	 
	 String bookName="zhebenshu";
	 String bookcallno="1455";
	 String studentname="zhangsan";
	 String studentcontact="1452452";
	 int studentid=12142;
	 
	@Test
	void test1() {
		assertEquals("update successfully",lib.issue(bookName,bookcallno,studentname,studentcontact,studentid));
	}
	void test2() {
		assertEquals("book not available",lib.issue(bookName,bookcallno,studentname,studentcontact,studentid));
	}
	void test3() {
		assertEquals("student id not exist",lib.issue(bookName,bookcallno,studentname,studentcontact,studentid));
	}
	void test4() {
		assertEquals("book not available and student not exist",lib.issue(bookName,bookcallno,studentname,studentcontact,studentid));
	}

}
