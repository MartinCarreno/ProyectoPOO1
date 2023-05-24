
public class ClienteMain {
	public static void main(String[] args) {
		

		InventarioLetras inventario = new InventarioLetras("aaggghhhh", 1);
		InventarioLetras inventario2 = new InventarioLetras("ggg", 1);
		InventarioLetras inventario3 = new InventarioLetras("aaggg", 1);

		


		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		inventario3.set('h', 4);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		inventario3.set('m', 1);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		inventario3.set('g', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		inventario3.set('b', 2);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		inventario3.set('z', 1);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		inventario3.set('p', 4);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		inventario3.set('z', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		inventario3.set('b', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		inventario3.set('a', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		inventario3.set('h', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		inventario3.set('p', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		inventario3.set('m', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " " + inventario3.contadorLetras());
		





	}
}
