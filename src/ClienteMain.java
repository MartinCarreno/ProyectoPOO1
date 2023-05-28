
public class ClienteMain {
	public static void main(String[] args) {

		InventarioLetras inventario = new InventarioLetras("aaggghhhhñ");
		InventarioLetras inventario2 = new InventarioLetras("ggg");
		InventarioLetras inventario3 = new InventarioLetras("aaggg");
		InventarioLetras inventario4 = new InventarioLetras("hello");

		System.out.println(inventario);
		
		System.out.println(inventario2);
		InventarioLetras sum = inventario.add(inventario2);
		System.out.println(sum.toString() + " " + sum.size() + " " + sum.isEmpty() + " " + sum.contadorLetras());
		System.out.println(sum.toString() + " " + sum.size() + " " + sum.isEmpty() + " " + sum.contadorLetras());
		InventarioLetras res = sum.subtract(inventario2);
		InventarioLetras res2 = res.subtract(inventario2);
		System.out.println(res2.toString() + " " + res2.size() + " " + res2.isEmpty() + " " + res2.contadorLetras());
		InventarioLetras res3 = res2.subtract(res2);
		System.out.println(res3);
		System.out.println(inventario4.getData());

		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('h', 4);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('m', 1);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('g', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('b', 2);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('z', 1);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('p', 4);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('z', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('b', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('a', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('h', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('p', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('m', 0);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('g', 3);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('a', 2);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('h', 4);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		inventario3.set('m', 1);
		System.out.println(inventario3.size() + " " + inventario3.toString() + " " + inventario3.isEmpty() + " "
				+ inventario3.contadorLetras());
		System.out.println();
		
		

		

	}
}
