package ejercicios;

import java.util.*;

public class PruebaVector {
	

		Vector pruebaVector1=new Vector(10,5);{
		pruebaVector1.add("uno");
		pruebaVector1.add("dos");
		pruebaVector1.add("tres");
		pruebaVector1.add("cuatro");
		pruebaVector1.add("cinco");
		
		System.out.println("\n" + "El tamaño del vector es: " + pruebaVector1.size());
		
		pruebaVector1.remove(1);
		pruebaVector1.remove(2);
		System.out.print("El resultado del vector despues de eliminar el 2do y 3er elemento es: ");
		for(int i=0; i<pruebaVector1.size(); i++){
	        System.out.print(pruebaVector1.elementAt(i)+" ");
	    }
	}
	public String toString(){
		return String(pruebaVector1);
	}
	private String String(Vector pruebaVector12) {
		// TODO Auto-generated method stub
		return null;
	}
}
