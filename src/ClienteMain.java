
public class ClienteMain {
	public static void main(String[] args) {
		Language len = new Language();
		LanguageEs l = new LanguageEs();
		System.out.println(len.getAbecedario());
		System.out.println(l.getAbecedario());

		InventarioLetras inventario = new InventarioLetras("supercalifragilisticoespialidoso", 1);
		InventarioLetras vacio = new InventarioLetras("", 2);

		
		inventario.getCharList();
		System.out.println();
		char letraCifrada = inventario.encriptarCesar('o');
		System.out.println(letraCifrada);
		System.out.println();
		System.out.println(inventario.size());
	    
	    System.out.println(vacio.isEmpty());
	    System.out.println(inventario.toString());
	    System.out.println(inventario.get('i'));
	    System.out.println(inventario.get('7'));

	    
	    }
	}


