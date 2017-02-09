package Zadanie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.sql.Date;

import lombok.Data;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface InfoAdno {
	//Stwórz adnotacje, która przechowywać będzie informacje o autorze metody lub pola, i 
	//dacie ostatniej modyfikacji. 
	//Następnie stwórz komendę, która po wpisaniu do konsoli "version" wypisze autorów i 
	//ostatnie zmiany z wszystkich pól i metod w programie (lub testowo w jednej obrazowej 
	// klasie, minimalnie 5 metod i 5 pól);
	 

	public String info();
	public String author();
	public String data();
	
	

}
