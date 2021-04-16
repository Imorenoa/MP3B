package pacdesarrollo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Crear user
	
		
		Usuario usuario = new Usuario();
		
		//Pedir nombre
		
		Scanner sc = new Scanner(System.in); //System .in  Hace referrencia a la entrada estandar (Teclado)
		
		String nombre = sc.nextLine();
		
		//Pedir edad
		
		int edad = sc.nextInt();
		sc.nextLine();
		
		//Pedir DNI
		String dni = sc.next();
		sc.nextLine();
		
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(dni);
		
	}
}
