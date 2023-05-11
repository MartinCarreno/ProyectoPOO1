

import java.util.*;
public class InventarioLetras {
	private String data;
	private HashMap<Character, Integer> charList; // para tener el recuento de las letras
	
	
	//Constructor
	public InventarioLetras(String data, int lenguaje) { // agrego nuevo parametro para elegir el lenguaje
		this.data = data;
		this.charList = new HashMap<Character, Integer>();

		
		//si lenguaje es 1 = ingles, si es 2 = español
		if(lenguaje == 1) {
			Language l = new Language();
			for(int i = 0; i<l.getAbecedario().length();i++) {
				//se crea un hashmap con todas las letras del abecedario y con su valor en 0
				this.charList.put(l.getAbecedario().charAt(i), 0);
			}

			//contador de cada letra
			int cont = 0;
			for(int i = 0; i<l.getAbecedario().length(); i++) {
				char caracter = l.getAbecedario().charAt(i);
				for(int n = 0; n<data.length();n++) {
					if(data.charAt(n)==caracter) {
						cont++;
					}
				}
				this.charList.put(caracter, cont);
				cont = 0; 
			}
			
		}
		
		else if (lenguaje == 2) {
			Language l = new LanguageEs(); //Polimorfismo
			for(int i = 0; i<l.getAbecedario().length();i++) {
				this.charList.put(l.getAbecedario().charAt(i), 0);
			}
			
			int cont = 0;
			for(int i = 0; i<l.getAbecedario().length(); i++) {
				char caracter = l.getAbecedario().charAt(i);
				for(int n = 0; n<data.length();n++) {
					if(data.charAt(n)==caracter) {
						cont++;
					}
				}
				this.charList.put(caracter, cont);
				cont = 0; 
			}
		}
	}
	//SOLO PARA TESTEAR, Borrar despues
	public void getCharList() {
		System.out.println(this.charList);
	}
   
	public char encriptarCesar(char letra) {
		
		return 'a';
	}
	
	public void encriptarPalabra ( char letra , int valor ) {
		
	}
	
	public void desencriptarPalabra ( char letra , int valor ) {
		
	}
	
	public int get ( char letra ) {
		return this.charList.get(letra);
	}
	
	public void set ( char letra , int valor ) {
		
	}
	
	public int size () {
		return 0;
	}
	
	public boolean isEmpty () {
		return true;
	}
	
	public String toString () {
		return "";
	}
	
	public InventarioLetras add ( InventarioLetras otro ) {
		
		InventarioLetras inventarioNuevo = new InventarioLetras("", 1);
		
		return inventarioNuevo;
	}
	public InventarioLetras amplifies (int n ) {
		
		InventarioLetras inventarioNuevo = new InventarioLetras("", 1);
		
		return inventarioNuevo;
	}
	public InventarioLetras subtract ( InventarioLetras otro ) {
		InventarioLetras inventarioNuevo = new InventarioLetras("", 1);
		
		return inventarioNuevo;
	}
}
