package bookandauthor;

public class BookApp {

	public static void main(String[] args) {
		Author author = new Author("Santa", "santa@santa", 'f');
		System.out.println(author);

		Book book = new Book("Gamer's life", author, 210.5);
		System.out.println(book);

	}

}
