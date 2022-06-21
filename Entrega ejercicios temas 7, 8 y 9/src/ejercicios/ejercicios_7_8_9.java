package ejercicios;

import java.util.*;

public class ejercicios_7_8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arreglos prueba=new Arreglos();
		prueba.toString();
		System.out.println("");
		
		ArreglosDos pruebaDos=new ArreglosDos();
		pruebaDos.toString();
		
		System.out.println("");
		Cadena pruebaCadena=new Cadena("Hola mundo");
		
		pruebaCadena.toString();
		System.out.println("");
		
		PruebaVector vector=new PruebaVector();
		vector.toString();
		/* El problema de usar un vector por defecto cuando se intentan agregar 1000 elementos es que no controlamos el 
		 * crecimiento del vector, este se duplicara cada que se exceda el limite del vector.
		 */
		System.out.println("");
		
		PruebaArrayList arrayList=new PruebaArrayList();
		arrayList.toString();
		System.out.println("\n");
		try {
			DividePorCero(7,0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { System.out.println("\nDemo de código");
			
		}
		System.out.println("\n");
		
		CopiarFichero pruebaFichero=new CopiarFichero();
		Scanner in = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen: ");
        String entrada = in.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String salida = in.nextLine();
        pruebaFichero.pruebaCopiarFichero(entrada,salida);
		
	}
	
	private int a;
	private int b;
	private static float resultado;
	public static double DividePorCero(int a, int b) throws ArithmeticException {
	    
		if (b <= 0) {
	        throw new ArithmeticException("Esto no puede hacerse"); 
		}else{
			double resultado= a / b;
			System.out.println("El resultado de la division es: " + resultado);
		}
		return resultado;
	}
}
	
