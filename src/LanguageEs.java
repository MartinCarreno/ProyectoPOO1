
public class LanguageEs extends Language{
	
	private String abecedarioEs = super.getAbecedario().substring(0,14) + '\u00f1' + super.getAbecedario().substring(14);
	
	
	
	public String getAbecedario() {
		return abecedarioEs;
	}
}
