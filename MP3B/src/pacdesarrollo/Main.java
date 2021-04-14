package pacdesarrollo;

public class Main {

	public static void main(String[] args) {
		Gasto gasto = new Gasto(2345, "Alquiler");
		/*gasto.setDescriptiopn("Alquiler");
		gasto.setDinero(500.0);*/
		
		System.out.println(gasto);
		
		Ingreso ingreso = new Ingreso(5000, "venta coches");
		
		System.out.println(ingreso);
		
	}

}
