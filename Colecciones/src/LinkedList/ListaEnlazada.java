package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListaEnlazada {

	public static void main(String[] args) {
		
		LinkedList<String> paises= new LinkedList<String>();
		paises.add("España");
		paises.add("Italia");
		paises.add("Francia");
		paises.add("Alemania");
		
		LinkedList<String> capitales= new LinkedList<String>();
		paises.add("Madrid");
		paises.add("Roma");
		paises.add("Paris");
		paises.add("Berlin");
		//Creo los iteradores de las listas
		ListIterator<String> itListasA = paises.listIterator();
		ListIterator<String> itListasB = capitales.listIterator();
		
		while(itListasB.hasNext()) {
			if(itListasA.hasNext()) {
				itListasA.next();
			}
			itListasA.add(itListasB.next());
		}
		System.out.println(paises);
	}
}
