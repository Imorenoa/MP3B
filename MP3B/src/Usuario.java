
//Clase usuario
public class Usuario {

	private String nombre;

	private int edad;

	private String DNI;

	// Constructor
	public Usuario() {
	}

	// Getter nombre
	public String getNombre() {
		return nombre;
	}

	// Setter nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Getter edad
	public int getEdad() {
		return edad;
	}

	// Setter edad
	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Getter DNI
	public String getDNI() {
		return DNI;
	}

	// Setter DNI
	public boolean setDNI(String DNI) {
		/*
		 * REGEX: Establece una "plantilla" sobre el que tiene que encajar el string DNI
		 * que le estamos pasando a la funcion. Al ser una funcion booleana nos devuelve
		 * false o true, de manera que utilizamos esto para el bucle del Main
		 */
		String regex = "(\\d{8})([-]?)([A-Za-z]{1})";
		if (DNI.matches(regex)) {
			this.DNI = DNI;
			return true;
		} else {
			return false;
		}

	}

	public String toString() {
		return "Usuario con los datos: \n\tNombre: " + nombre + ", Edad: " + edad + ", DNI: " + DNI;
	}
}
