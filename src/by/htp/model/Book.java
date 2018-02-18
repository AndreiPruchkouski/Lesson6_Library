package by.htp.model;

public class Book {

	String author;
	String title;
	int year;
	
	
	public Book() {
		
	}
	
	public Book(String author, String title, int year) {
		this.author = author;
		this.title = title;
		this.year = year;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getTitle()	{
		return this.title;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
}
