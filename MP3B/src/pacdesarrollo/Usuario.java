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
	
	public boolean setDNI (String DNI) {
		/* TODO establecer funcionalidad del SET DNI*/
		return false;
	}
	
	public String toString() {
		return "Usuario con los datos: \n\tNombre: " +	nombre + ", edad:" + edad + ", DNI" + DNI;
	}
}
