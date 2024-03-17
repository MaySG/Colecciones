/*
 * Mapa q almacena empleados
 */
package Mapas;

import java.util.HashMap;
import java.util.Map;

public class mapas {

	public static void main(String[] args) {
		
		// Se crea el mapa empleados
		HashMap<String, Empleado> personal = new HashMap <String,Empleado>();
		// introduzco empleados dentro del mapa
		personal.put("145", new Empleado("Juan"));//clave y nombre
		personal.put("146", new Empleado("Maria"));
		personal.put("147", new Empleado("Benito"));
		personal.put("148", new Empleado("Sandra"));
		// imprimo por pantalla la informacion que hay dentro del mapa
		System.out.println(personal);
		
		// eliminar una clave del mapa
		personal.remove("147");
		
		// imprimo por pantalla la informacion que hay dentro del mapa despues de eliminarlo
		System.out.println(personal);
		
		// para cambiarlo
		personal.put("148", new Empleado ("Natalia"));
		
		// imprimo por pantalla la informacion que hay dentro del mapa despues de reenplazarlo
		System.out.println(personal);
		
		// Para que nos imprima una coleccion: System.out.println(personal.entrySet());
		
		// bucle for q nos devuelve lo que hay almacenado en la coleccion en forma de set
		// accde a la pareja de clave y valor y asi puedo acceder a ellas
		for(Map.Entry<String,Empleado> entrada: personal.entrySet()){
		//almaceno la clave y el valor en variables y asi puedo acceder a ellas	
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			System.out.println("Clave: "+ clave + ", Valor: " + valor);
		}
	}
}

//Clase que construye el mapa de empleados

class Empleado {
	
	private String nombre;
	private double sueldo;
	
	public Empleado(String n) {
		nombre = n;
		sueldo=2000;
	}
	
	public String toString() {
		return " [Nombre =" + nombre +", sueldo=" + sueldo + "]";
	}
}