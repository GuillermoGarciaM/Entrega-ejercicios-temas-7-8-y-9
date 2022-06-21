package ejercicios;

import java.util.*;

public class PruebaArrayList {
	ArrayList<String> prueba= new ArrayList<String>();{
	for (int i=1; i<=4; i++){
		prueba.add("Elemento "+i); 
	}
	//System.out.println(prueba);
	}
	Iterator<String> iterador = prueba.iterator();{
	while(iterador.hasNext()){
		String elemento = iterador.next();
		System.out.print(elemento+", ");
	}
	System.out.print("\n");
	}
	
	LinkedList<String> linkedlist = new LinkedList<String>();{
	linkedlist.addAll(prueba);
	//System.out.print(linkedlist);
		Iterator<String> iteradorlist = linkedlist.iterator();{
			while(iteradorlist.hasNext()){
				String elementolist = iteradorlist.next();
				System.out.print(elementolist+", ");
			}
		}
		System.out.print("\n");
	}
	
	ArrayList<Integer> pruebaInt= new ArrayList<Integer>();{
		for (int j=1; j<=10; j++){
			pruebaInt.add(j); 
		}
		
		for (int i=1; i<=pruebaInt.size()-1; i++){
			if((pruebaInt.get(i) % 2) == 0) {
				System.out.print(i + " ");
			}
		}
		//System.out.println(pruebaInt);
	}
	
	
}
