package Iterador;

import java.util.Objects;

public class Cliente {
	
	private String nombre;
	private String num_cuenta;
	private double saldo;
	
	public Cliente (String nombre,String num_cuenta,double saldo) {
		this.nombre = nombre;
		this.num_cuenta = num_cuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, num_cuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nombre, other.nombre)&& Objects.equals(num_cuenta, other.num_cuenta);
	}
	
	
	
}
