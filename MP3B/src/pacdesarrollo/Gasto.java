package pacdesarrollo;

public class Gasto extends Dinero{	
	
	//Constructor con parametros
	public Gasto(double gasto,String description) {
		
		this.dinero = gasto;
		
		this.description = description;
	}
	
	public String toString() {
		return "Datos del gasto: \n\t Cantidad:" + dinero + " , descripcion: " + description;
		
	}
}
