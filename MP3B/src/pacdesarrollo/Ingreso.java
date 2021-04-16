package pacdesarrollo;

public class Ingreso extends Dinero{

		public Ingreso (double ingreso, String description){
			this.dinero = ingreso;
			this.description = description;
			
		}
		public String toString() {
			return "Datos del ingreso: Cantidad: " + dinero + " , descripcion: " + description;
			
		}
}