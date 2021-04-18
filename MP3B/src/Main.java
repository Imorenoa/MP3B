import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Crear user

		Usuario usuario = new Usuario();

		// Pedir nombre
		System.out.println("\nIntroduce el nombre del usuario");

		String nombre = sc.nextLine();
		usuario.setNombre(nombre);

		// Pedir edad

		System.out.println("\nIntroduce edad del usuario");
		int edad = sc.nextInt();
		sc.nextLine();
		usuario.setEdad(edad);

		// Pedir DNI

		boolean dniCorrecto;
		do {
			System.out.println("\nIntroduce el DNI del usuario");
			String dni = sc.next();
			sc.nextLine();
			dniCorrecto = usuario.setDNI(dni);
		} while (!dniCorrecto);

		Cuenta cuenta = new Cuenta(usuario);

		// Crear el menu:
		String menu = "\nRealiza una nueva accion: \n" + "1 Introduce un nuevo gasto \n"
				+ "2 Introduce un nuevo ingreso \n" + "3 Mostrar gastos \n" + "4 Mostrar ingresos \n"
				+ "5 Mostrar saldo \n" + "0 Salir";
		
		System.out.println(menu);

		int num = sc.nextInt();

		while (num != 0) {
	

			sc.nextLine();
			switch (num) {

			case 1:

				System.out.println("\nIntroduce la descripcion: ");

				String descrigast = sc.nextLine();

				System.out.println("\nIntroduce la cantidad: ");

				double gasto = sc.nextDouble();
				
				try {
					cuenta.addGastos(descrigast, gasto);
				} catch (GastoException ex) {
					System.out.println(ex.getMessage());
				}
				

				break;

			case 2:

				System.out.println("\nIntroduce la descripcion: ");

				String descring = sc.nextLine();

				System.out.println("\nIntroduce la cantidad: ");

				double ingreso = sc.nextDouble();

				cuenta.addIngresos(descring, ingreso);

				break;

			case 3:
								
				System.out.println(cuenta.getGastos());
	
				break;

			case 4:
				
				System.out.println(cuenta.getIngresos());
				
				break;

			case 5:
				
				System.out.println(cuenta.toString());
				
				break;
			}

			System.out.println(menu);
			num = sc.nextInt();
		}
		System.out.println("Fin del programa.\nGracias por utilizar la aplicacion.");
		sc.close();
	}
}
