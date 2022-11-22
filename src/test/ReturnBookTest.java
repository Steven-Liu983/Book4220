import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class ReturnBookTest {
	BookDao bookDao = null;
	ReturnBookDao returnBookDao = null;
	
	public void setUp() 
	{
		BookDao.save("aa", "Hello kitty", "jack", "publisher", 10);
		IssueBookDao.save("aa", 1, "tom", "110");
	}
	public void tearDown() 
	{
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from books where callno='aa'");
			ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
	}
	@Test
	public void test001Delete() 
	{
		setUp();
		int result = ReturnBookDao.delete("aa", 1);
		tearDown();
		assertEquals(1, result);
	}
	
	@Test
	public void test002DeleteCallNoNotExist() 
	{
		int result = ReturnBookDao.delete("aa1", 1);
		assertEquals(0, result);
	}
	
	@Test
	public void updatebook() 
	{
		setUp();
		int result = ReturnBookDao.updatebook("aa");
		tearDown();
		assertEquals(1, result);
	}
	
	@Test
	public void updatebookCallNoNotExist() 
	{
		int result = ReturnBookDao.updatebook("aa1");
		assertEquals(0, result);
	}
	

}
