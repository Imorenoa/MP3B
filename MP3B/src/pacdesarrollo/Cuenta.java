package pacdesarrollo;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	private double saldo;
	
	private Usuario usuario;
	
	private List<Gasto> gastos= new ArrayList<>();
	
	private List<Ingreso> ingresos = new ArrayList<>();
	
	public Cuenta (Usuario usuario) {
		
		this.usuario = usuario;
		
		this.saldo = 0.0;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;		
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;		
	}
	
	public double addIngresos(String description, double cantidad) {
		
		this.saldo +=  cantidad;
		
		Ingreso ingreso = new Ingreso(cantidad, description);
						
		this.ingresos.add(ingreso);
		
		return saldo;
	}
	
	public double addGastos(String description, double cantidad) {
		
		if (cantidad >= saldo) {
			
			/* TODO Lanzar exception */
			return 0.0;
			
		} else {
			
			this.saldo -= saldo;
			
			Gasto gasto = new Gasto(cantidad, description);
			
			this.gastos.add(gasto);
			
			return saldo;
		}
				
	}
	
	public List<Gasto> getGastos(){
		return gastos;
	}
	
	public List<Ingreso> getIngresos(){
		return ingresos;
	}
	
	public String toString() {
		return "Cuenta de " + usuario.getNombre() + "\n\tSaldo: " + saldo;
	}
	
	
	
}
