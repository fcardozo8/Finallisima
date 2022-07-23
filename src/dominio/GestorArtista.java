package dominio;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GestorArtista {
	
	private static GestorArtista ga;
	private ArrayList<Artista> misArtistas;
	
	private GestorArtista() {
		misArtistas=new ArrayList<Artista>() ;
	}
	
	public static GestorArtista getInstancia() {
		if(ga==null) ga=new GestorArtista();
		return ga;
	}
	
	public boolean addArtista(Artista a) {
		if (!yaEstaCargado(a)) {
			return misArtistas.add(a);
		}
		return false;
	}
	
	private boolean yaEstaCargado(Artista a) {
		
		return misArtistas.stream().filter(a1 -> a1.equals(a)).count()>0;
	}

	public int cantidadDeArtistas() {
		return misArtistas.size();
		
	}

	public void blanquearArtistas() {
		misArtistas.clear();
		
	}

	public ArrayList<Artista> getArtistas(String parteNombre) {
		
	}
	
	public ArrayList<Artista> getArtistasImplementarConLambda(String parteNombre) {
		Collections.sort(misArtistas, new OrdenPorNombre());
		return (ArrayList<Artista>) misArtistas.stream().filter(a1->a1.getNombre().contains(parteNombre)).collect(Collectors.toList());

	}
	
	public ArrayList<Artista> getArtistasImplementarConLambda(int edadLimiteSuperior) {
		Collections.sort(misArtistas, new OrdenPorNombre());
		return (ArrayList<Artista>) misArtistas.stream().filter(a1->a1.getEdad()<=edadLimiteSuperior).collect(Collectors.toList());
		
	}
	
	public ArrayList<Artista> getArtistas(int edadLimiteSuperior) {
		
	}
	
	public ArrayList<Artista> getArtistas() {
		
	}
	
	public String getPromedioEdadArtistas(){
		
	}
	
	public String getPromedioEdadArtistas(Sexo s){
		
	}
	
}
