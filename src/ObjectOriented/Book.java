package src.ObjectOriented;

public class Book {

	private String name;
	private Author author;
	private double price;
	private int qytInStock;

	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, double price, int qytInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qytInStock = qytInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQytInStock() {
		return qytInStock;
	}

	public void setQytInStock(int qytInStock) {
		this.qytInStock = qytInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public String getAuthorName() {
		return author.getName();
	}

	public String getAuthorEmail() {
		return author.getEmail();
	}

	@Override
	public String toString() {
		return name +" by " + author ;
	}

	public static void main(String[] args) {

		Author firstAuthor = new Author("Lior Kinsbruner", "Lior.k@solaredge.com", 'm');
		Author secondAuthor = new Author("Hen faibish", "Hen.f@solaredge.com", 'm');

		Book oneBook = new Book("Java for dummy", firstAuthor, 19.95, 1000);
		Book twoBook = new Book("more Java for dummy", secondAuthor, 29.95, 888);
		System.out.println(oneBook.getAuthorName());
		System.out.println(oneBook.getAuthorEmail());
		System.out.println(twoBook.getAuthorEmail());
		System.out.println(twoBook.getAuthorEmail());

	}

}
