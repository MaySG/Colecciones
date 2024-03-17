package hashCode;

import java.util.Objects;

public class Libro {

	private String titulo;
	private String nombre;
	private int ISBN;

	public Libro(String titulo, String nombre, int ISBN) {
		this.titulo = titulo;
		this.nombre = nombre;
		this.ISBN = ISBN;
	}

	public String getDatos() {
		return "El titulo es: " + titulo + ", el autor: " + nombre + ", y su ISBN es: " + ISBN ;
	}

	/**
	 * 
	 * // puedo crear el metodo para equals (no puede ser q me diga q son diferentes
	 * libros si tienen el mismo ISBN public boolean equals(Object obj) {
	 * 
	 * if(obj instanceof Libro) { //le pasamos un objeto para q lo compare con Libro
	 * Libro otro = (Libro)obj;//hago el castin para convertirlo en tipo libro
	 * if(this.ISBN == otro.ISBN) { // si son iguales return true; //verdadero }else
	 * {// false return false; } }else { return false;// si los objetos no son
	 * instancias de la clase Libro } }
	 **/
	// cuando sobreescribimos equals, tambien hay q sobreescribir hashCode, se hace
	// con el asistente
	// y decimos q campo es el marca la diferencia, en este ejemplo el ISBN

	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return ISBN == other.ISBN;
	}
}