package Zadanie;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String tekst = "version";
		
		if (text.equals(tekst)){
			adnoChecker();
			new Main();
		} else {
			System.out.println("bledny tekst");
		}
		
				
	}
	
	public Main(){
		
	}
	
	@InfoAdno(info="Metoda pierwsz", author="Maks", data ="11-02-2016")
	public void methodOne(){
		
		//das
	}
	
	@InfoAdno(info="Metoda druga", author="Maks", data ="11-12-2016")
	public void methodTwo(){
		//das
	}
	
	
	//Pola
	
	@InfoAdno(info = "pole 1", author = " Rafal", data = "21-01-2017")
	private int x;
	
	public static void adnoChecker(){
		Main main = new Main();
		for (Method m: main.getClass().getDeclaredMethods()){
			if(m.isAnnotationPresent(InfoAdno.class)){
				InfoAdno adno = m.getAnnotation(InfoAdno.class);
				System.out.println("Metoda: " + m.getName());
				System.out.println("Autor: " + adno.author());
				System.out.println("Data modyfiklacji: " + adno.data());
				System.out.println("-------------------");
			}
		}
		
		for (Field f: main.getClass().getDeclaredFields()){
			if(f.isAnnotationPresent(InfoAdno.class)){
				InfoAdno adno = f.getAnnotation(InfoAdno.class);
				System.out.println("Pole: " + f.getName());
				System.out.println("Autor: " + adno.author());
				System.out.println("Data modyfiklacji: " + adno.data());
				System.out.println("-------------------");
			}
		}
	}

}
