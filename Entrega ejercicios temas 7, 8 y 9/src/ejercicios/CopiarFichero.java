package ejercicios;

import java.io.*;

public class CopiarFichero {
	static void pruebaCopiarFichero (String copia, String pegar) {
		try {
			InputStream entrada= new FileInputStream(copia);
			byte[] info= entrada.readAllBytes();
			entrada.close();
			
			PrintStream salida=new PrintStream(pegar);
			salida.write(info);
			salida.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error" + e);
		}
	}
}
