// comprobamos con equals y hash si son el mismo libro
package hashCode;

public class hashCode {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro ("P en Java", "Juan", 25);
		Libro libro2 = new Libro ("P en Java", "Juan", 25);
		

		if (libro1.equals(libro2)) {
			System.out.println("Es el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
			
		}else {
			System.out.println("No es el mismo libro");
			// si no es el mismo q nos imprima su hashCode
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}
		
		System.out.println(libro1.getDatos());
	}
}
