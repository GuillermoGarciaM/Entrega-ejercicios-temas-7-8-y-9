package ejercicios;

public class ArreglosDos {

	int[][] dosDimensiones;{
		dosDimensiones=new int[3][3];
		dosDimensiones[0][0]=1;
		dosDimensiones[0][1]=2;
		dosDimensiones[0][2]=3;
		dosDimensiones[1][0]=4;
		dosDimensiones[1][1]=5;
		dosDimensiones[1][2]=6;
		dosDimensiones[2][0]=7;
		dosDimensiones[2][1]=8;
		dosDimensiones[2][2]=9;
		for (int x=0; x < dosDimensiones.length; x++) 
		 {
		    for (int y=0; y < dosDimensiones[x].length; y++) 
		    {

		     System.out.print(" | ");System.out.print (dosDimensiones[x][y]); System.out.print(" | ");

		    }
		  System.out.println();
		
		}
	}
}
