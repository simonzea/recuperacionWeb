package model;

public class LugarRecomendado {
	public String Nombre;
	public String Direccion;
	public String Barrio;
	public Double Valor;
	
	public LugarRecomendado(String nombre, double valor) {
		Nombre = nombre;
		Valor = valor;
	}
	
	public LugarRecomendado(String nombre, String direccion, Double valor ) {
		Nombre = nombre;
		Direccion = direccion;
		Valor = valor;
	}
	
	public int compareTo( LugarRecomendado o) {
		if(Valor > o.Valor) {
			return -1;
		}
		if(Valor < o.Valor){
			return 1;
		}
		return 0;
	}
}
