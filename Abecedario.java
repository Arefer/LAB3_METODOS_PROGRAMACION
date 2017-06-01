import java.util.ArrayList;
public class Abecedario{
	// Atributos
	char[] consonantes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 
		'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
	char[] vocales = {'a', 'e', 'i', 'o', 'u'};

	public ArrayList<String> generarCombinaciones(){
		ArrayList<String> palabras = new ArrayList<String>();
		for (char l1: this.consonantes){
			for (char l2: this.vocales){
				for (char l3: this.consonantes){
					for (char l4: this.vocales){
						String palabra = ""+l1+l2+l3+l4;
						palabras.add(palabra);
					}
				}
			}
		}
		return palabras;
	}
}