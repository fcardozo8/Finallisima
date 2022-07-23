package dominio;

import java.util.Comparator;

public class OrdenPorNombre implements Comparator<Artista>{
	
	
	public int compare(Artista a, Artista b) {
		
		if (!a.getNombre().equalsIgnoreCase(b.getNombre())) {
			return a.getNombre().compareTo(b.getNombre());
		}
		else {
			return a.getFechaNacto().compareTo(b.getFechaNacto());
		}
		
		
		
		
	}
	

}
