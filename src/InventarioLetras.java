
import java.util.*;

public class InventarioLetras {
	private String data;
	private HashMap<Character, Integer> charList; // para tener el recuento de las letras
	private int valorLenguaje;
	private Language lenguaje;

	// Constructor
	public InventarioLetras(String data, int lenguaje) { // agrego nuevo parametro para elegir el lenguaje
		this.data = data;
		this.charList = new HashMap<Character, Integer>();
		this.valorLenguaje = lenguaje;
		// si lenguaje es 1 = ingles, si es 2 = español
		if (lenguaje == 1) {
			Language l = new Language();
			this.lenguaje = l;
			for (int i = 0; i < l.getAbecedario().length(); i++) {
				// se crea un hashmap con todas las letras del abecedario y con su valor en 0
				this.charList.put(l.getAbecedario().charAt(i), 0);
			}

			// contador de cada letra
			int cont = 0;
			for (int i = 0; i < l.getAbecedario().length(); i++) {
				char caracter = l.getAbecedario().charAt(i);
				for (int n = 0; n < data.length(); n++) {
					if (data.charAt(n) == caracter) {
						cont++;
					}
				}
				this.charList.put(caracter, cont);
				cont = 0;
			}

		}

		else if (lenguaje == 2) {
			Language l = new LanguageEs(); // Polimorfismo
			this.lenguaje = l;
			for (int i = 0; i < l.getAbecedario().length(); i++) {
				this.charList.put(l.getAbecedario().charAt(i), 0);
			}

			int cont = 0;
			for (int i = 0; i < l.getAbecedario().length(); i++) {
				char caracter = l.getAbecedario().charAt(i);
				for (int n = 0; n < data.length(); n++) {
					if (data.charAt(n) == caracter) {
						cont++;
					}
				}
				this.charList.put(caracter, cont);
				cont = 0;
			}
		}
	}

	public HashMap<Character, Integer> getCharList() { // Devuelve el mapa de caracteres con sus respectivos recuentos

		return charList;
	}

	public String getData() { // Devuelve los datos almacenados en el inventario

		return data;
	}

	public int getLenguaje() { // Devuelve el valor del lenguaje (1 para inglés, 2 para español)

		return valorLenguaje;
	}

	public void set(char letra, int valor) { // Establece el valor de un carácter en el inventario
		letra = Character.toLowerCase(letra);
		charList.put(letra, valor);
	}

	public void setData(String data) { // Establece los datos del inventario

		this.data = data;
	}

	public int get(char letra) { // Devuelve el recuento de un carácter específico en el inventario

		letra = Character.toLowerCase(letra);
		if (!charList.containsKey(letra)) {
			throw new IllegalArgumentException("El caracter no está en el alfabeto");
		}
		return charList.get(letra);
	}

	public int size() { // Devuelve el tamaño total del inventario (suma de todos los recuentos)

		int totalSize = 0;
		for (int cont : charList.values()) {
			totalSize += cont;
		}
		return totalSize;
	}

	public boolean isEmpty() { // Verifica si el inventario está vacío (todos los recuentos son 0)

		for (int cont : charList.values()) {
			if (cont != 0) {
				return false;
			}
		}
		return true;
	}

	public String toString() { // Devuelve una representación en cadena del inventario

		StringBuilder sb = new StringBuilder("[");
		for (char letra : charList.keySet()) {
			int count = charList.get(letra);
			for (int i = 0; i < count; i++) { // Se agrega la letra actual la cantidad de veces que indica su cuenta al
												// StringBuilder
				sb.append(Character.toLowerCase(letra));
			}
		}

		sb.append("]");
		return sb.toString();
	}

	public InventarioLetras add(InventarioLetras otro) { // Combina el inventario actual con otro inventario y devuelve
															// un nuevo inventario combinado

		InventarioLetras inventarioNuevo = new InventarioLetras(otro.getData() + this.data, 1);
		return inventarioNuevo;
	}

	public InventarioLetras amplifies(int n) { // Amplía el inventario actual multiplicando los datos n veces y devuelve
												// un nuevo inventario ampliado

		InventarioLetras inventarioNuevo;
		if (n != 1) {
			String datos = "";
			for (int i = 0; i < n; i++) {
				datos += data;
			}
			inventarioNuevo = new InventarioLetras(datos, valorLenguaje);
			return inventarioNuevo;
		}
		inventarioNuevo = new InventarioLetras(data, valorLenguaje);
		return inventarioNuevo;

	}

	public InventarioLetras subtract(InventarioLetras otro) { // Resta otro inventario del inventario actual y devuelve
																// un nuevo inventario resultante

		InventarioLetras inventarioNuevo = new InventarioLetras("", 1);

		int cont = 0;
		for (int i = 0; i < lenguaje.getAbecedario().length(); i++) {
			char caracter = lenguaje.getAbecedario().charAt(i);

			cont = this.get(caracter) - otro.get(caracter);

			if (cont < 0) { // para no tener negativos
				cont = 0;
			}

			inventarioNuevo.set(caracter, cont);
			cont = 0; // se resetea el contador
		}

		if (inventarioNuevo.size() == 0) {
			return null;
		}
		return inventarioNuevo;
	}

	public String contadorLetras() { // Devuelve un contador de letras en forma de cadena

		StringBuilder contador = new StringBuilder();

		for (char letra = 'a'; letra <= 'z'; letra++) {
			int cantidad = this.get(letra);
			contador.append(cantidad).append(" ");
		}

		return contador.toString().trim();
	}
}
