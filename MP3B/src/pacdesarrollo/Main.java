package pacdesarrollo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Crear user

		Usuario usuario = new Usuario();
		
		// Pedir nombre
		System.out.println("Introduce el nombre del usuario");
		
		String nombre = sc.nextLine();
		usuario.setNombre(nombre);

		// Pedir edad

		System.out.println("Introduce edad del usuario");
		int edad = sc.nextInt();
		sc.nextLine();
		usuario.setEdad(edad);

		// Pedir DNI

		boolean dniCorrecto;
		do {
			System.out.println("Introduce el DNI del usuario");
			String dni = sc.next();
			sc.nextLine();
			dniCorrecto = usuario.setDNI(dni);
		} while (!dniCorrecto);
		
		Cuenta cuenta = new Cuenta(usuario);		
		//Crear el menu:
		String menu = "Realiza una nueva accion: \n"
				+ "1 Introduce un nuevo gasto \n"
				+ "2 Introduce un nuevo ingreso \n"
				+ "3 Mostrar gastos \n"
				+ "4 Mostrar ingresos \n"
				+ "5 Mostrar saldo \n"
				+ "0 Salir";
		
		System.out.println(menu);
		
		
		while (sc.nextInt()!=0) {
			int num = sc.nextInt();		
			sc.nextLine();
			switch (num) {
			
			/*Para entrar a los diferentes "case" tengo que introducir el numero dos veces (en realidad 
			 *da igual que meta como primero, el que coje es el segundo) Pensaba que con el sc.nextLine(); lo apañaria pero nada
			 */
			case 1:
				
				/* En este caso no tengo ni idea de por que no me espera a que introduzca el dato, no se que hago mal y despues
				 * para utilizarlo en la clase add gastos como haria para mostrarlo: */
				
				System.out.println("Introduce descripcion del gasto:");
				
				String descriGasto = sc.nextLine();
				
				System.out.println("Introduce cantidad:");
				
				double gasto = sc.nextDouble();
				
				cuenta.addGastos(descriGasto, gasto); //Me comenta que no tengo la excepcion gasto exception manejada y que como solucion añadir al throw
						
				cuenta.toString();
				
				break;
			
			case 2:
				
				System.out.println("Introduce descripcion del ingreso:");
				
				String descriIngreso = sc.nextLine();
				
				System.out.println("Introduce cantidad:");
				
				double ingreso = sc.nextDouble();
								
				cuenta.addIngresos(descriIngreso, ingreso);
				
				cuenta.toString();
				
				break;
				
			case 3:
				//Como accedo a las listas, lo mismo para los ingresos y saldo
				System.out.println();
				break;
			
			case 4:
				System.out.println();
				break;
				
			case 5:
				System.out.println(saldo);
				break;
			}
			
			System.out.println(menu);
			
		}
		System.out.println("Fin del programa.\nGracias por utilizar la aplicacion.");
		sc.close();	
	}
}
