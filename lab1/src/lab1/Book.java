package lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

//task 12, 14, 15
public class Book implements Comparable<Book> {
	
	private String title;
	private String author;
	private int price;
	private static int edition;
	private Integer isbn;
	
	@SuppressWarnings("static-access")
	Book(String title, String author, int price, int edition, Integer isbn){
		this.title = title;
		this.author = author;
		this.price = price;
		this.edition = edition;
		this.isbn = isbn;
	}
	
	Book(){}
	
	@SuppressWarnings("static-access")
	Book(String title, String author, int price, int edition){
		this.title = title;
		this.author = author;
		this.price = price;
		this.edition = edition;
	}
	
	public void setTitle(String title) {this.title = title;}
	public String getTitle() {return title;}
	
	public void setAuthor(String author) {this.author = author;}
	public String getAuthor() {return author;}
	
	public void setPrice(int price) {this.price = price;}
	public int getPrice() {return price;}
	
	@SuppressWarnings("static-access")
	public void setEdition(int edition) {this.edition = edition;}
	public int getEdition() {return edition;}
	
	public void setIsbn(int isbn) {this.isbn = isbn;}
	public Integer getIsbn() {return isbn;}
	
	@SuppressWarnings("static-access")
	@Override
    public boolean equals(Object obj) {		
		if (obj == this) {
            return true;
        } 
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        } 
        Book book = (Book)obj; 
        return book.title.equals(title) && book.author.equals(author) && book.price == price && book.edition == edition && book.isbn == isbn;
	}	
	
	@Override
	public int hashCode() {
		int h1 = title == null ? 0 : title.hashCode();
		int h2 = author == null ? 0 : author.hashCode();
		int hash = h1 + h2 + price + edition + isbn;
		return hash;
	}
	
	@Override 
	public String toString() {
		return "Book: title = '" + title + "', author = '" + author + "', price = " + price + ", edition = " + edition + ", isbn = " + isbn;
	}
	
	@SuppressWarnings("static-access")
	@Override
	public Object clone() {
		Book copy = new Book();
		copy.title = this.title;
		copy.author = this.author;
		copy.price = this.price;
		copy.edition = this.edition;
		return copy;
	}
	
	public int compareTo(Book book) {
		return this.isbn - book.isbn;
	}
	
	public static void main(String args[]) {
		
		TreeSet<Book> books = new TreeSet<Book>();
		Book b1 = new Book("The Touch", "Keyes", 15, 2, 123);
		Book b2 = new Book("The Touch", "Keyes", 15, 2, 123);
		Book b3 = new Book("Flowers for Algernon", "Keyes", 20, 8, 114);
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		
		System.out.println(b1.hashCode());
		
		System.out.println(b2.toString());
		
		System.out.println(b3.clone());	
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		System.out.println(books);
		
		Comparator<Book> titleC = new TitleComparator();
		Comparator<Book> titleauthorC = new TitleComparator().thenComparing(new AuthorComparator());
		Comparator<Book> authortitleC = new AuthorComparator().thenComparing(new TitleComparator());
		Comparator<Book> authortitlepriceC = new AuthorComparator().thenComparing(new TitleComparator()).thenComparing(new PriceComparator());
		
		ArrayList<Book> books2 = new ArrayList<Book>();
		books2.add(new Book("Sputnik Sweetheart", "Murakami", 20, 1, 895));
		books2.add(new Book("Fight Club", "Palahniuk", 25, 2, 263));
		books2.add(new Book("Great Expectations", "Dickens", 30, 5, 458));
		books2.add(new Book("Surely You’re Joking, Mr Feynman!", "Feynman", 15, 4, 322));

		books2.sort(titleC);
        	System.out.println(Arrays.toString(books2.toArray()));
        	books2.sort(titleauthorC);
        	System.out.println(Arrays.toString(books2.toArray()));
        	books2.sort(authortitleC);
        	System.out.println(Arrays.toString(books2.toArray()));
        	books2.sort(authortitlepriceC);
        	System.out.println(Arrays.toString(books2.toArray()));
	}
}
