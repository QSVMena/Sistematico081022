package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import dol.Book;

public class Bookdal {

	private Book book;
	private List<Book> books;
	private String filepath;
	private String filename;

	public Bookdal() {
		super();
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public void save() {
		File file = new File(filepath + "//" + filename);
		try {
			ObjectOutputStream ou = new ObjectOutputStream(new FileOutputStream(file));
			ou.writeObject(book);
			ou.flush();
			ou.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Book Open() throws ClassNotFoundException {
		File file = new File(filepath);

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Book b = (Book) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public void SaveList() {
		File file = new File(filepath + "//" + filename);

		try {
			ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file));
			ous.writeObject(book);
			ous.flush();
			ous.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Book> ListBook() {

		try {
			File file = new File(filepath);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			List<Book> b = (List<Book>) ois.readObject();
			ois.close();
			return b;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
