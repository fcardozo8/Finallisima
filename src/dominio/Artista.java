package dominio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Artista implements Comparable<Artista>{
	
	private String nombre;
	private GregorianCalendar fechaNacto;
	private Sexo sexo;
	private int anio;
	private int mes;
	private int dia;
	
	public Artista(String nombre, GregorianCalendar fechaNacto, Sexo sexo) throws ExceptionArtista {
		this.nombre=ArtistaUtil.inicialesMayus(nombre);
//		if ((fechaNacto.get(Calendar.YEAR)+18)<new GregorianCalendar().get(Calendar.YEAR))
		if (getEdad(fechaNacto)>=18) {
			System.out.println(getEdad(fechaNacto)+"   "+nombre);
			this.fechaNacto=fechaNacto;
		}else {
			throw new ExceptionArtista("No se permiten artistas menores ("+getEdad(fechaNacto)+")");
		}
			
		
		this.sexo=sexo;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anio;
		result = prime * result + dia;
		result = prime * result + ((fechaNacto == null) ? 0 : fechaNacto.hashCode());
		result = prime * result + mes;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		if (anio != other.anio)
			return false;
		if (dia != other.dia)
			return false;
		if (fechaNacto == null) {
			if (other.fechaNacto != null)
				return false;
		} else if (!fechaNacto.equals(other.fechaNacto))
			return false;
		if (mes != other.mes)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public GregorianCalendar getFechaNacto() {
		fechaNacto.set(Calendar.YEAR,anio);
		fechaNacto.set(Calendar.MONTH,mes-1);
		fechaNacto.set(Calendar.DAY_OF_MONTH,dia);
		return fechaNacto;
	}

	public void setFechaNacto(GregorianCalendar fechaNacto) {
	
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getFechaCorta() {
		SimpleDateFormat f= new SimpleDateFormat("dd/MM/yy");
		
		return f.format(fechaNacto.getTime());
		 
	}
	
	public int getEdad() {
	int anio;
	int anioA;	
	int mes;
	int mesA;
	int dia;
	int diaA;	
	anio=fechaNacto.get(Calendar.YEAR);
	anioA=new GregorianCalendar().get(Calendar.YEAR);
	mes=fechaNacto.get(Calendar.MONTH);
	mesA=new GregorianCalendar().get(Calendar.MONTH);
	dia=fechaNacto.get(Calendar.DAY_OF_MONTH);
	diaA=new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
	anio= anioA-anio;
	
	if (mesA<mes) {
		anio=anio-1;
	}
	else {
		if(mesA==mes){
			if (dia>=diaA) {
				anio=anio-1;
			}
		}
	}	
	return anio;
	}
	
	
	public int getEdad(GregorianCalendar fechaNacto) {
		int anio;
		int anioA;	
		int mes;
		int mesA;
		int dia;
		int diaA;	
		anio=fechaNacto.get(Calendar.YEAR);
		anioA=new GregorianCalendar().get(Calendar.YEAR);
		mes=fechaNacto.get(Calendar.MONTH);
		mesA=new GregorianCalendar().get(Calendar.MONTH);
		dia=fechaNacto.get(Calendar.DAY_OF_MONTH);
		diaA=new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
		anio= anioA-anio;
		
		if (mesA<mes) {
			anio=anio-1;
		}
		else {
			if(mesA==mes){
				if (dia>=diaA) {
					anio=anio-1;
				}
			}
		}	
		return anio;
		}
		
	@Override
	public String toString() {
		return ArtistaUtil.sexoMF(sexo)+" "+"Artista: "+ArtistaUtil.inicialesMayus(nombre)+" "+"("+getFechaCorta()+")";
	}



	@Override
	public int compareTo(Artista arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

