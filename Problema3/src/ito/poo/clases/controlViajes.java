package ito.poo.clases;

import java.time.LocalDate;

public class controlViajes {

	private String destino = "";
	private String direccion = "";	
	private LocalDate fechaViaje = null;
	private LocalDate fechaRegreso = null;
	private int montoViaje = 0;


	private String detallesCarga = "";


	public controlViajes() {
		// Start of user code constructor for viajes)
		super();
		// End of user code
	}
	public controlViajes(String destino, String direccion, LocalDate fechaViaje, LocalDate fechaRegreso,
			int montoViaje, String detallesCarga) {
		super();
		this.destino = destino;
		this.direccion = direccion;
		this.fechaViaje = fechaViaje;
		this.fechaRegreso = fechaRegreso;
		this.montoViaje = montoViaje;
		this.detallesCarga = detallesCarga;
	}

	public void asignacionvehiculo(String asignar) {
	
	}


	public String getdestino() {
		return this.destino;
	}


	public void setdestino(String newdestino) {
		this.destino = newdestino;
	}


	public String getDireccion() {
		return this.direccion;
	}


	public void setDireccion(String newDireccion) {
		this.direccion = newDireccion;
	}


	public LocalDate getfechaViaje() {
		return this.fechaViaje;
	}


	public void setfechaViaje(java.time.LocalDate newfechaViaje) {
		this.fechaViaje = newfechaViaje;
	}


	public LocalDate getfechaRegreso() {
		return this.fechaRegreso;
	}


	public void setfechaRegreso(java.time.LocalDate newfechaRegreso) {
		this.fechaRegreso = newfechaRegreso;
	}


	public int getmontoViaje() {
		return this.montoViaje;
	}


	public void setmontoViaje(int newmontoViaje) {
		this.montoViaje = newmontoViaje;
	}


	public String getdetallesCarga() {
		return this.detallesCarga;
	}

	public void setdetallesCarga(String newdetallesCarga) {
		this.detallesCarga = newdetallesCarga;
	}

	@Override
	public String toString() {
		return "viajes [destino=" + destino + ", direccion=" + direccion + ", fechaViaje="
				+ fechaViaje + ", fechaRegreso=" + fechaRegreso + ", montoViaje=" + montoViaje
				+ ", detallesCarga=" + detallesCarga + "]";
	}

}
