package by.htp.model;

public class Library {
	
	private Book[] books;
	private int booksCounter;

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		if(this.books != null) {
			if(booksCounter < books.length) {
				books[booksCounter] = book;
				booksCounter++;
			}else {
				Book[] books = new Book[this.booksCounter + 1];
				for(int i = 0; i < this.books.length; i++) {
					books[i] = this.books[i];
				}
				this.books = books;
				this.books[booksCounter] = book;
				booksCounter++;
			}
		}
		else {
				this.books = new Book[5];
				this.books[0] = book;
				booksCounter++;
			}	
	}
	
	public void deleteBook(String title) {
		for(int i = 0; i < this.books.length; i++) {
			if(this.books[i] != null && this.books[i].title == title) {
				this.books[i] = null;
			}
		}
	}
	
	public void findByAuthor(String author) {
		int resultnumber = 0;
		for(int i = 0; i < this.books.length; i++) {
			if(this.books[i] != null && this.books[i].author == author) {
				resultnumber++;
			}
		}
		
		if(resultnumber > 0) {
			System.out.println("Книг с указанным вами автором: " + resultnumber);
			for(int i = 0; i < this.books.length; i++) {
				if(this.books[i] != null && this.books[i].author == author) {
					System.out.println(this.books[i].title + " " + this.books[i].year);
				}
			} 
		}else {
			System.out.println("Книг с указанным вами автором не найдено");
		}
		System.out.println();
	}
	
	public void sortByYear() {
		for(int i = this.books.length-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(this.books[j] != null && this.books[j+1] != null && this.books[j].year > this.books[j+1].year) {
					Book tmp = this.books[j];
					this.books[j] = this.books[j+1];
					this.books[j+1] = tmp;
				}
			}
		}
	}
	
	public void printLibrary() {
		System.out.println("Список книг в библиотеке:");
		for(Book bookitem: books) {
			if(bookitem != null)
			System.out.println(bookitem.title + " " + bookitem.author + " " + bookitem.year);
		}
	}
	
	

//	методы
//	удалить книгу по названию ++ 




	
}
