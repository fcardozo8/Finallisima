package dominio;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArtistaUtil {
	
	public static String sinEspacios(String palabra) {
		String []array=palabra.split(" ");
		String palabra2= "";
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].length()>0) {
				palabra2+=" "+array[i];
			}
		}
		
		return palabra2.substring(1);
		
		
	}

	
	public static String inicialesMayus(String palabra) {
		String []array=sinEspacios(palabra).split(" ");
		String palabra2= "";
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].length()>0) {
				palabra2+=" "+array[i].substring(0, 1).toUpperCase()+array[i].substring(1).toLowerCase();
			}
		}
		
		return palabra2.substring(1);
		
		
	}
	
	public static String sexoMF(Sexo sexo) {
		String palabra="";
		if (sexo.equals(Sexo.Masculino)) {
			palabra="El";
		}	
		else
			palabra="La";
		
		return palabra;
		
		
		
		
	}

	public static void main(String[] args) {
		String palabra=" bernardo   silva";
		
		ArtistaUtil u= new ArtistaUtil();
		System.out.println(u.inicialesMayus(palabra));		
		
	}
}
