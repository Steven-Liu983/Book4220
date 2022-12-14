package test;

public class Book {
	String title; // Title of book
	String author; // Author of book
	
	/*
	 * By making the 'Person' class a field here, we are 
	 *	linking both classes!
	 */
	Person person; // Person related to this book 

	public Book(String string) {
		this.title = string;
		this.author = "unknown author";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setPerson(Person p2) {
		this.person = p2;
		
	}

	public Person getPerson() {
		return this.person;
	}
	
	public String toString() {
		String availability;
		if (this.getPerson() == null) {
			availability = "Available";
		} else {
			availability = "Checked out to " + this.getPerson().getName();
		}
		return this.getTitle() + " by " + this.getAuthor() + "; " + availability;
	}

}
