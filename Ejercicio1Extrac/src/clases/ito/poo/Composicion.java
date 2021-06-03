package clases.ito.poo;

import java.util.Date;
import java.util.ArrayList;

public class Composicion {

	public Composicion(String titulo, Float duracionPista, String genero,
			java.util.Date date, java.util.Date date2) {
		super();
		this.titulo = titulo;
		this.duracionPista = duracionPista;
		this.interpretes = interpretes;
		this.genero = genero;
		this.fechaRegistro = (Date) date;
		this.fechaEstreno = (Date) date2;
	}

	private String titulo;
	private Float duracionPista;
    private static java.util.List<String> interpretes= new ArrayList<String>();
	private String genero;
	private Date fechaRegistro;
	private Date fechaEstreno;
	
	public  void PedirCompositor(String nuevoInterprete) {
	   
		interpretes.add(nuevoInterprete);
	    
	}


	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public Float getDuracionPista() {
		return duracionPista;
	}



	public void setDuracionPista(Float duracionPista) {
		this.duracionPista = duracionPista;
	}



	public static java.util.List<String> getInterpretes() {
		return interpretes;
	}



	public static void setInterpretes(java.util.List<String> interpretes) {
		Composicion.interpretes = interpretes;
	}



	public String getgenero() {
		return genero;
	}



	public void setgenero(String genero) {
		this.genero = genero;
	}



	public Date getfechaRegistro() {
		return fechaRegistro;
	}



	public void setfechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}



	public Date getfechaEstreno() {
		return fechaEstreno;
	}



	public void setfechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}



	@Override
	public String toString() {
		return "Composicion [titulo=" + titulo + ", duracionPista=" + duracionPista + ", genero=" + genero
				+ ", fechaRegistro=" + fechaRegistro + ", fechaEstreno=" + fechaEstreno + "]";
	}
}

