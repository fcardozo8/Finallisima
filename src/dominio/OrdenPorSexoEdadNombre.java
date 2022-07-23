package dominio;

import java.util.Comparator;

public class OrdenPorSexoEdadNombre implements Comparator<Artista>{

	
	public int compare(Artista a, Artista b) {
		
		if (!a.getSexo().equalsIgnoreCase(b.getNombre())) {
			return a.getNombre().compareTo(b.getNombre());
		}
		else {
			return a.getFechaNacto().compareTo(b.getFechaNacto());
		}
	}	
}
