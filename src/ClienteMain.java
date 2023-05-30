import java.util.Scanner;
public class ClienteMain {
	public static void main(String[] args) {
		
		System.out.println("Bienvenido a InventarioLetras");
		Scanner x = new Scanner(System.in);
		System.out.print("Ingrese su palabra: ");
		String texto = x.next();
		
		InventarioLetras palabra = new InventarioLetras(texto); 
		
		int opcion = 1;
		Scanner op = new Scanner(System.in);
		while(opcion != 0) {
			
			System.out.println("-------------------------");
			System.out.println("Su palabra es: " + palabra.getData());
			System.out.print("Escoja una de las opciones: ");
			System.out.println(" 1. Encriptar letra con cifrado cesar\n "
							  + "2. Encriptar Palabra con Encriptado cesar\n "
							  + "3. Desencriptar Palabra\n "
							  + "4. Devolver Lista con recuentos de cada letra\n "
							  + "5. ");
			System.out.print("opcion: ");
			opcion = op.nextInt();
			
			switch (opcion) {
				case 1:
					Scanner i = new Scanner(System.in);
					System.out.print("Ingrese letra: ");
					System.out.println("la letra encriptada es: "+palabra.encriptarCesar(i.next().charAt(0)));
				case 2:
					System.out.println("la palabra encriptada es: "+palabra.encriptarPalabra());
			
			
			}
		}

	}
}
