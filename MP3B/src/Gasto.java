//Con extends declaramos la herencia
public class Gasto extends Dinero {

	// Constructor con parametros
	public Gasto(double gasto, String description) {

		this.dinero = gasto;

		this.description = description;
	}

	public String toString() {
		return "\nDescripcion: " + description + "\t\t\tCantidad: " + dinero + "€\n";

	}
}
