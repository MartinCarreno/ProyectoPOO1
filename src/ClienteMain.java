import java.util.Scanner;
public class ClienteMain {
	public static void main(String[] args) {

		System.out.println("Bienvenido a InventarioLetras");
		Scanner x = new Scanner(System.in);
		System.out.print("Ingrese su palabra: ");
		String texto = x.next();
		

		InventarioLetras palabra = new InventarioLetras(texto); 
		
		int opcion = -1;	
		while(opcion != 0){
			
			System.out.println("-------------------------");
			System.out.println("Su palabra es: " + palabra.getData());
			System.out.println("Escoja una de las opciones: ");
			System.out.println(" 1. Encriptar letra con cifrado cesar\n "
					+ "2. Encriptar Palabra con Encriptado cesar\n "
					+ "3. Desencriptar Palabra\n "
					+ "4. Devolver Lista con recuentos de cada letra\n "
					+ "5. Obtener los recuentos de una letra en especifico\n "
					+ "6. Total de la suma de los recuentos\n "
					+ "7. Comprobar si esta vacia la lista\n "
					+ "8. Devolver lista de todas las letras\n "
					+ "9. Combinar un inventario con otro\n "
					+ "10. Ampliar el inventario por medio de multiplicacion\n "
					+ "11. Restar un inventario con el actual\n "
					+ "12. Cambiar la palabra"
					+ "0. para salir");


			System.out.print("opcion: ");
			Scanner op = new Scanner(System.in);
			opcion = op.nextInt();

			switch (opcion) {
			case 0:
				System.out.println("Hasta Luego!");
				break;
			case 1:
				Scanner i = new Scanner(System.in);
				System.out.print("Ingrese letra: ");
				System.out.println("la letra encriptada es: "+palabra.encriptarCesar(i.next().charAt(0)));
				break;
			case 2:
				palabra.encriptarPalabra();
				System.out.println("la palabra está encriptada");
				break;
			case 3:
				palabra.desencriptarPalabra();
				System.out.println("la palabra está desencriptada");
				break;
			case 4:
				System.out.println(palabra.getCharList());
				break;
			case 5:
				Scanner letra = new Scanner(System.in);
				System.out.print("ingrese la letra para buscar: ");
				System.out.println(palabra.get(letra.next().charAt(0)));
				break;
			case 6:
				System.out.println("La suma de todos los recuentos es: "+ palabra.size());
				break;
			case 7:
				if(palabra.isEmpty()) {
					System.out.println("el inventario esta vacio");
				}else {
					System.out.println("El inventario NO esta vacio");
				}
				break;
			case 8:
				System.out.println(palabra);
				break;
			case 9:
				System.out.println("Ingrese una nueva palabra: ");
				Scanner p = new Scanner(System.in);
				InventarioLetras palabraNueva = new InventarioLetras(p.next());
				System.out.println(palabra.add(palabraNueva));
				break;
			case 10:
				System.out.println("ingrese numero: ");
				Scanner num = new Scanner(System.in);
				System.out.println(palabra.amplifies(num.nextInt()));
				break;
			case 11:
				System.out.println("Ingrese una nueva palabra: ");
				Scanner n = new Scanner(System.in);
				InventarioLetras palabraNueva2 = new InventarioLetras(n.next());
				System.out.println(palabra.subtract(palabraNueva2));
				break;
			case 12:
				System.out.println("Ingrese la nueva palabra: ");
				Scanner text = new Scanner(System.in);
				palabra.setData(text.next());
				break;
			default:
				System.out.println("Ingrese Opcion valida >:(");
			}

		} 
		
	}
}


