import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
	
	public RegexApp() {
		iniciarApp();
	}
	
	String texto = "Estos datos positivos también tienen su correlación con la salud. La tasa de mortalidad\r\n" + //
            "entre los recién nacidos era de 64,8 por cada 1.000 en 1990. Pero en 2016, la realidad\r\n" + //
            "era bien diferente, ya que solo 30,5B fallecían por cada 1.000 (en 26 años se ha reducido un\r\n" + //
            "53%). Igual de positivo es la caída de la mortalidad entre los menores de 5A; en 26 años se\r\n" + //
            "ha pasado de una tasa de 93,4 fallecidos por 1.0E2 a un 40,8 (una reducción del 56%).\r\n" + //
            "De igual manera, el número de mujeres que fallece durante el parto también ha decrecido\r\n" + //
            "(en 1990 el número de muertes fue de 532.000 y en 2015 de 303.00.0, una disminución del\r\n" + //
            "43%).";
	
	public void iniciarApp() {
		// Números naturales
		String regexNatural = "\\b\\d+\\b";
		imprimirResultados(texto, regexNatural, "Números naturales");
		
		// Números reales
		String regexReal = "\\b\\d+[.,]\\d+\\b";
		imprimirResultados(texto, regexReal, "Números reales");
		
		// Números porcentuales
		String regexPorcentajes = "\\d+[%)]";
		imprimirResultados(texto, regexPorcentajes, "Números porcentuales");
		
		// Números exponenciales
		String regexExponencial = "\\d+(?:[.,]\\d+[Ee]\\d{1,}|[Ee]\\d{1,})";
		imprimirResultados(texto, regexExponencial, "Números exponenciales");
	}

	public void imprimirResultados(String texto, String regex, String tipo) {
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(texto);

	    System.out.println(tipo + ":");
	    while (matcher.find()) {
	        System.out.println("  " + matcher.group());
	    }
	}
}