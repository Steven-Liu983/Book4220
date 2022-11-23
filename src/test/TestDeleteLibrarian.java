package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDeleteLibrarian {
    //add a librarian
    private librarian libr=new librarian();
    int id=333;
    String name="Shakespeare";
    String password="1111";
    String email="Shakespeare@gmail.com";
    String address="231 downtown";
    String city="windsor";
    String contact="987654321";

    @Test
    public void testDeleteLibrarian() {
        //public static int save(String name,String password,String email,String address,String city,String contact)
        assertEquals("add successfully",libr.add(id, name, password, email, address, city, contact));

        //public static int delete(int id)
        assertEquals("delete fail",libr.deleteLibrarian(id));
        assertEquals("delete fail",libr.deleteLibrarian(0));

    }



}
