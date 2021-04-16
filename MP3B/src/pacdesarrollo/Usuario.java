package pacdesarrollo;

public class Usuario {
	
	private String nombre;
	
	private int edad;
	
	private String DNI;
	
	public Usuario() {}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	public String getDNI () {
		return DNI;
	}
		
	public boolean setDNI(String DNI) {
		//REGEX
		String regex = "(\\d{8})([-]?)([A-Za-z]{1})";
		if (DNI.matches(regex)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "Usuario con los datos: \n\tNombre: " +	nombre + ", Edad: " + edad + ", DNI: " + DNI;
	}
}
