package dol;

import java.sql.Date;

public class Book {
	
	
	private String Title;
	private String Editorial;
	private String Edicion;
	private int AñoPublicacion;
	
	public Book() {
		
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public String getEdicion() {
		return Edicion;
	}

	public void setEdicion(String edicion) {
		Edicion = edicion;
	}

	public int getAñoPublicacion() {
		return AñoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		AñoPublicacion = añoPublicacion;
	}
	
	
		

}
