package by.htp.runner;

import by.htp.model.Book;
import by.htp.model.Library;

public class MainApp {	
	
	public static void main(String[] args) {
		
		String toDelete = "Title2";
		String toFind = "Author3";
		
		Book book1 = new Book("Author1", "Title1", 2005);
		Book book2 = new Book("Author2", "Title2", 2004);
		Book book3 = new Book("Author3", "Title3", 2003);
		Book book4 = new Book("Author4", "Title4", 2002);
		Book book5 = new Book("Author5", "Title5", 2001);
		Book book6 = new Book("Author6", "Title6", 2000);
		Book book7 = new Book("Author7", "Title7", 1999);
		Book book8 = new Book("Author8", "Title8", 1998);
		
		
		Library lib = new Library();
		
		lib.addBook(book1);
		lib.addBook(book2);
		lib.addBook(book3);
		lib.addBook(book4);
		lib.addBook(book5);
		lib.addBook(book6);
		lib.addBook(book7);
		lib.addBook(book8);
		
//		lib.deleteBook(toDelete);
		lib.findByAuthor(toFind);
		
		lib.sortByYear();
		
		lib.printLibrary();
		
		
		
		
	}

}
