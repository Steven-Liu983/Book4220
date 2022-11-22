import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class BookDaoTest {

	
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
	public void testSaveSuccess() 
	{
		tearDown();
		int result = BookDao.save("aa", "Hello kitty", "jack", "publisher", 0);
		assertEquals(1, result);
		
	}
	
	@Test
	public void testSaveCallNoExist() 
	{
		tearDown();
		int result = BookDao.save("aa", "Hello kitty", "jack", "publisher", 0);
		assertEquals(1, result);
		
		result = BookDao.save("aa", "Hello kitty", "jack", "publisher", 0);
		assertEquals(0, result);
		
	}
	
	
	@Test
	public void testSaveFailedWhenCallnoError() 
	{
		int result = BookDao.save(null, "Hello kitty", "jack", "publisher", 0);
		assertEquals(0, result);
	}
	
	@Test
	public void testSaveFailedWhenNameError() 
	{
		int result = BookDao.save("aa", null, "jack", "publisher", 0);
		assertEquals(0, result);
	}
	
	@Test
	public void testSaveFailedWhenAuthorError() 
	{
		int result = BookDao.save("aa", "Hello kitty", null, "publisher", 0);
		assertEquals(0, result);
	}
}
