package ito.poo.clases;

import java.time.LocalDate;

public class lineatransporte {


	private String Marca = "";
	private int modelo = 0;
	private int maximacarga = 0;
	private LocalDate fechaAquisicion = null;
	private String listaViajes = "";
	
	public lineatransporte() {
		// Start of user code constructor for lineatransporte)
		super();
		// End of user code
	}
	
	
	public lineatransporte(String Marca, int modelo, int maximacarga, LocalDate fechaAquisicion,
			String listaViajes) {
		
		
		super();
		this.Marca = Marca;
		this.modelo = modelo;
		this.maximacarga = maximacarga;
		this.fechaAquisicion = fechaAquisicion;
		this.listaViajes = listaViajes;
	}

	
	public String getMarca() {
		return this.Marca;
	}

	public void setMarca(String newMarca) {
		this.Marca = newMarca;
	}


	public int getModelo() {
		return this.modelo;
	}


	public void setModelo(int newModelo) {
		this.modelo = newModelo;
	}


	public int getmaximacarga() {
		return this.maximacarga;
	}


	public void setmaximacarga(int newmaximacarga) {
		this.maximacarga = newmaximacarga;
	}


	public LocalDate getfechaAquisicion() {
		return this.fechaAquisicion;
	}

	public void setfechaAquisicion(LocalDate newfechaAquisicion) {
		this.fechaAquisicion = newfechaAquisicion;
	}


	public String getlistaViajes() {
		return this.listaViajes;
	}


	public void setlistaViajes(String newlistaViajes) {
		this.listaViajes = newlistaViajes;
	}

	@Override
	public String toString() {
		return "lineatransporte [Marca=" + Marca + ", modelo=" + modelo + ", maximacarga=" + maximacarga
				+ ", fechaAquisicion=" + fechaAquisicion + ", listaViajes=" + listaViajes + "]";
	}

}
