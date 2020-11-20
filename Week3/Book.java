package Week3;

public class Book {
	String title, authorFirstName, authorLastName;
	String author = authorFirstName + authorLastName;
	double price;

	public Book(String title, String authorFirstName, String authorLastName, double price) {
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.price = price;

	}

	public void setTitle(String title) {

	}

	public void setAuthor(String author) {

	}

	public void setPrice(double price) {

	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {

		return author;
	}

	public String toString() {
		System.out.println(title + " " + authorFirstName + authorLastName + " " + price);
		return title;
	}

	public static void main(String args[]) {
		Book obj = new Book("Harry Potter", "J.K ", "Rowling", 50.00);
		obj.toString();

	}
}
