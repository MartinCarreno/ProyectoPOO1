
public class ClienteMain {
	public static void main(String[] args) {
		Language len = new Language();
		LanguageEs l = new LanguageEs();
		System.out.println(len.getAbecedario());
		System.out.println(l.getAbecedario());
		
		InventarioLetras inventario = new InventarioLetras("data", 1);
		inventario.getCharList();
	}
}
