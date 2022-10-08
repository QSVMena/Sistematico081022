package bll;
import dol.Autor;
import dol.Book;

import java.util.List;
import java.util.Scanner;

public class Aplication {
	
	private Scanner scan;
	private List <Autor> autor;
	private List<Book> book;
	
	
	
	public Aplication() {
		super();
	}

	public Aplication(Scanner scan) {
		super();
		this.scan = scan;
	}
	
	public void DisplayOption() {
		System.out.println("Gestionar Libro");
		System.out.println("1. Agregar");
		System.out.println("3. Salir");
		Short Option = 0;
		Option: scan.next();
		
		do {
			
			DisplayOption();
			switch(Option){
			
			case 1:
				break;
			case 2: 
				break;
			case 3:
				System.exit(0);
				break;
				
			
			}
		
			
		}while(Option!=0);
	}
	
	
	

}
