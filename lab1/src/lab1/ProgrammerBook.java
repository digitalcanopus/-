package lab1;

//task 13
public class ProgrammerBook extends Book {
	
	private String language;
	private int level;
	
	private String title;
	private String author;
	private int price;
	private int edition;
	
	ProgrammerBook(String title, String author, int price, int edition, String language, int level) {
		super(title, author, price, edition);	
		this.title = this.getTitle();
		this.author = this.getAuthor();
		this.price = this.getPrice();
		this.edition = this.getEdition();
		this.language = language;
		this.level = level;
	}
	
	@Override
	public boolean equals(Object obj) {		
		if (obj == this) {
            return true;
        } 
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        } 
        ProgrammerBook prbook = (ProgrammerBook)obj; 
        return prbook.title.equals(title) && prbook.author.equals(author) && prbook.price == price && prbook.edition == edition && prbook.language == language && prbook.level == level;
	}
	
	@Override
	public int hashCode() {
		int h1 = title == null ? 0 : title.hashCode();
		int h2 = author == null ? 0 : author.hashCode();
		int h3 = language == null ? 0 : language.hashCode();
		int hash = h1 + h2 + price + edition + h3 + level;
		return hash;
	}
	
	@Override 
	public String toString() {
		return "Book: title = '" + title + "', author = '" + author + "', price = " + price + ", edition = " + edition + ", language = '" + language + "', level = " + level;
	}
	
	public static void main(String args[]) {
		
		ProgrammerBook pr1 = new ProgrammerBook("Programming for Dummies", "Wang", 35, 4, "C", 1);
		ProgrammerBook pr2 = new ProgrammerBook("Programming for Dummies", "Wang", 35, 4, "C", 1);
		ProgrammerBook pr3 = new ProgrammerBook("Head First Java", "Sierra", 30, 2, "Java", 2);
		
		System.out.println(pr1.equals(pr2));
		System.out.println(pr1.equals(pr3));
		
		System.out.println(pr1.hashCode());
		
		System.out.println(pr1.toString());		
	}
}