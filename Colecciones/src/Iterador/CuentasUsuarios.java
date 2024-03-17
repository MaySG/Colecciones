package Iterador;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasUsuarios {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente (" Maria Perez", "ES001", 3000);
		Cliente cl2 = new Cliente (" Benita Nuñez", "ES002", 4000);
		Cliente cl3 = new Cliente (" Javier Nicolas", "ES003", 4500);
		Cliente cl4 = new Cliente (" Jorge Sanz", "ES004", 1000);
		Cliente cl5 = new Cliente (" Maria Perez", "ES001", 3000); //Esta repetido y no lo añade
		
		Set<Cliente> clientesBanco = new HashSet<Cliente>();
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		
		/* Recorrer con un iterador, no se aconseja
		Iterator<Cliente> it = clientesBanco.iterator(); //creo objeto iterador y lo llamo it para recorrer clientesBanco
		while(it.hasNext()) {// recorre la coleccion llamando a next con el iterador para obtener el nombre
			String nombre_cliente = it.next().getNombre();
		}*/
		// Eliminar un cliente con iterador, aqui si es mejor usar iterador y no bucle for
		Iterator<Cliente> it = clientesBanco.iterator();
		while(it.hasNext()) {
			String nombre_cliente = it.next().getNombre();
			if(nombre_cliente.equals("Javier Nicolas")) {
				it.remove();
			}
		}
		//Recorrer con bucle for
		  for (Cliente cliente: clientesBanco) {
		 	System.out.println(cliente.getNombre()+" "+cliente.getNum_cuenta()+" "+cliente.getSaldo());
			}
	}
}
