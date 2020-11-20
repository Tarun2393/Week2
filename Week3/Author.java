package Week3;

public class Author {

	String firstName;
	String lastName;

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public void setLastName(String lastName) {
		this.lastName = lastName;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String toString() {

		String Name = firstName + lastName;
		return Name;
	}

	public static void main(String args[]) {
		Author obj = new Author("John", " Stewart");
		System.out.println(obj.toString());

	}
}
