package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import dol.Autor;
import dol.Book;

public class Autordal {
	
	private Book book;
	private List<Autor> Autores;
	private String filepath;
	private String filename;
	
	public Autordal() {
		super();
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public List<Autor> getAutores() {
		return Autores;
	}

	public void setAutores(List<Autor> autores) {
		Autores = autores;
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
			ou.writeObject(Autores);
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

	public Autor Open() throws ClassNotFoundException {
		File file = new File(filepath);

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Autor a = (Autor) ois.readObject();
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

}
