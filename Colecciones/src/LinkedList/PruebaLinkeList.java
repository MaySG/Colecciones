package LinkedList;

import java.util.LinkedList;

public class PruebaLinkeList {

	public static void main(String[] args) {
		
		LinkedList<String> personas = new LinkedList<String>();
		personas.add("Pepe");
		personas.add("Maria");
		personas.add("Jose");
		personas.add("Agustina");
		
		System.out.println(personas.size());//numero de elementos
		personas.add("Alfredo");
		
		for(String persona:personas) {
			System.out.println(persona);
		}
	}
}
