package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class librarian {


	public String add(int id, String name,String password,String email,String address, String city,String contact) {
		String str1="add successfully";

		return str1;
	}

	public String add( String name,String password,String email,String address, String city,String contact) {
		String str1="id missing";

		return str1;
	}
	public String add(int id,String password,String email,String address, String city,String contact) {
		String str1="name missing";

		return str1;
	}

	public String view() {
		boolean status=false;
		//connect database first 
		//then select from the librarian table
		try {
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from librarian where name=? and password=?");
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
			if(rs!=null)
				return "get data from database";
			else
				return "no data in the table";

		}catch(Exception e){System.out.println(e);}

		return "connection fail";

	}

	public String issue(String bookName,String bookcallno,String studentname,String studentcontact,  int studentid) {
		boolean status=true;
		int condition=0;
		try{
			Connection con=DB.getConnection();

			if(status){
				PreparedStatement ps=con.prepareStatement("insert into issuebooks(bookcallno,studentid,studentname,studentcontact) values(?,?,?,?)");
				ps.setString(1,bookcallno);
				ps.setInt(2,studentid);
				ps.setString(3,studentname);
				ps.setString(4,studentcontact);
				condition=ps.executeUpdate();
				if(condition>0)
					status=true;
				else
					status=false;
				return "book issued successfully";
			}
			con.close();
		}catch(Exception e){System.out.println(e);}

		if(bookName==null) {
			return "book not exist";
		}
		return bookName;
	}

	public String deleteLibrarian(int id) {
		int delStatus=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from librarian where id=?");
			ps.setInt(1,id);
			delStatus=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		if(delStatus>0)
			return "delete successfully";
		else
			return "delete fail";

	}

}