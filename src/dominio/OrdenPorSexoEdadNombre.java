package dominio;

import java.util.Comparator;

public class OrdenPorSexoEdadNombre implements Comparator<Artista>{

	public int compare(Artista a, Artista b) {

		if (a.getSexo().name().compareTo(b.getSexo().name())==0) {
			if(a.getFechaNacto().compareTo(b.getFechaNacto())==0)
				return a.getNombre().compareTo(b.getNombre());
			else
				if(a.getFechaNacto().compareTo(b.getFechaNacto())<0)
					return 1;
				else
					return -1;
		}
		else {
			return -1;
		}
	}
}
