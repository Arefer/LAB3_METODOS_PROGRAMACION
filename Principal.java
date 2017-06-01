import java.io.IOException;
import java.util.ArrayList;
public class Principal{

    public static void main(String[] args) throws IOException {
        Archivo archivoSopa1 = new Archivo("Sopa1.in");
        String[] lineasArchivo = archivoSopa1.leer();
        char[][] sopaDeLetras1 = archivoSopa1.aMatriz(lineasArchivo);
        System.out.println("Sopa 1:");
        for(char[] fila: sopaDeLetras1){
        	for (char caracter: fila){
        		System.out.print(caracter + " ");
            }
            System.out.println();
        }
        System.out.println();

        Archivo archivoSopa2 = new Archivo("Sopa2.in");
        String[] lineasArchivo2 = archivoSopa2.leer();
        char[][] sopaDeLetras2 = archivoSopa2.aMatriz(lineasArchivo2);
        System.out.println("Sopa 2:");
        for(char[] fila: sopaDeLetras2){
            for (char caracter: fila){
                System.out.print(caracter + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        Abecedario abc = new Abecedario();
        // Genero todas las palabras posibles de la forma consonante-vocal-consonante-vocal
        //ArrayList<String> palabrasABuscar = abc.generarCombinaciones();
        ArrayList<String> palabrasABuscar =  abc.generarCombinaciones();        
        // Resuelvo la primera sopa de letras 
        Sopa sopa1 = new Sopa(sopaDeLetras1);
        ArrayList<String> encontradas1 = sopa1.resolverSopa(palabrasABuscar);
        /*
        System.out.println("Encontradas en la sopa 1:");
        for (String palabra: encontradas1){
            System.out.println(palabra);
        }*/
        // Resuelvo la segunda sopa de letras con las palabras encontradas en la primera
        Sopa sopa2 = new Sopa(sopaDeLetras2);
        ArrayList<String> encontradas2 = sopa2.resolverSopa(encontradas1);
        
        Archivo respuesta = new Archivo("Solucion.out");
        if (respuesta.escribirResultado(encontradas1, encontradas2, sopa1, sopa2)){
            System.out.println("Resultado escrito correctamente en 'Solucion.out'");
        }
    }
}