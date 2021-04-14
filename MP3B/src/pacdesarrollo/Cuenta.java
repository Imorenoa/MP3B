package pacdesarrollo;

import java.util.List;

public class Cuenta {
	
	private double saldo;
	
	private Usuario usuario;
	
	private List<Gasto> gastos;
	
	private List<Ingreso> ingresos;
	
	public Cuenta (Usuario usuario) {
		this.usuario = usuario;
		
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
		
		return 0.0;
	}
	
	public double addGastos(String description, double cantidad) {
		
		return 0.0;
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
