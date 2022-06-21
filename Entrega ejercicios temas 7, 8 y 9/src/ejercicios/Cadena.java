package ejercicios;

public class Cadena {
	String cadena;
	public Cadena(String prueba){
		int i;
		String cadena=prueba;{
			for(i=cadena.length()-1;i>=0;i--) {
			System.out.print(cadena.charAt(i));
			}
		}
	}
	public String toString(){
		return cadena;
	}
}
