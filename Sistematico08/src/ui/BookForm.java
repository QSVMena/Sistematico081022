package ui;

import java.util.List;
import java.util.Scanner;

import dol.Book;

public class BookForm {

	private Scanner scan;
	private Book book;
	private List<Book> books;

	public BookForm(Scanner scan, Book book, List<Book> books) {
		super();
		this.scan = scan;
		this.book = book;
		this.books = books;
	}

	public BookForm(Scanner scan) {
		super();
		this.scan = scan;
	}

	public BookForm(Book book) {
		super();
		this.book = book;
	}

	public BookForm(List<Book> books) {
		super();
		this.books = books;
	}

	public Book catchBook() {
		Book b = new Book();
		System.out.println("Título: ");
		b.setTitle(scan.nextLine());

		System.out.println("Editorial: ");
		b.setEditorial(scan.nextLine());

		System.out.println("Edicion: ");
		b.setEdicion(scan.nextLine());

		System.out.println("Año de publicacion: ");
		b.setAñoPublicacion(scan.nextInt());

		return b;
	}

	public void showBook() {
		System.out.printf("Título: %s\n", book.getTitle());
		System.out.printf("Editorial: %s\n", book.getEditorial());
		System.out.printf("Edicion: %s\n", book.getEdicion());
		System.out.printf("Año de Publicacion: %s\n", book.getAñoPublicacion());
	}

	public void showBooks() {
		for (int i = 0; i < books.size(); i++) {
			System.out.printf("%d | %s | %s| %s\n", i + 1, books.get(i).getTitle(), books.get(i).getEditorial(),
					books.get(i).getEdicion(), books.get(i).getAñoPublicacion());
		}

	}

}
