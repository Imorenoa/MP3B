package pacdesarrollo;

public class Main {
	public static void main(String[] args) {
	
	
		Usuario usuario = new Usuario();
	
		Cuenta cuenta = new Cuenta(usuario);
	
		cuenta.addIngresos("Clases", 4567);
		
		System.out.println(cuenta.getIngresos());
	}
}
