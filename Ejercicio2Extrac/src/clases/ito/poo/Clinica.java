package clases.ito.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Clinica {
	public Clinica(String nombre, String rfc, LocalDate fechaNac) {
		super();
		Nombre = nombre;
		this.rfc = rfc;
		this.fechaNac = fechaNac;
	}

	/**
	 * Description of the property Nombre.
	 */
	public String Nombre = "";

	/**
	 * Description of the property rfc.
	 */
	public String rfc = "";

	/**
	 * Description of the property fechaNac.
	 */
	public LocalDate fechaNac = null;

	/**
	 * Description of the property fechaConsulta.
	 */
	public java.time.LocalDate fechaConsulta = null;

	// Start of user code (user defined attributes for Clinica)

	// End of user code

	/**
	 * The constructor.
	 */
	public Clinica() {
		// Start of user code constructor for Clinica)
		super();
		// End of user code
	}

	/**
	 * Description of the method agregarConsulta.
	 * @param fecha 
	 * @param sintomas 
	 * @param temperatura 
	 * @param peso 
	 * @param estatura 
	 */
	
	
	
	private ArrayList<LocalDate>fecha=new ArrayList<LocalDate>();
	
	private ArrayList<String>Sintomas=new ArrayList<String>();
	
	private ArrayList<Integer>temperatura=new ArrayList<Integer>();
	
	private ArrayList<Float>peso=new ArrayList<Float>();
	
	private ArrayList<Float>estatura=new ArrayList<Float>();
	
	
	public void agregarConsulta(java.time.LocalDate fecha, String sintomas, int temperatura, float peso,
			float estatura) {
		// Start of user code for method agregarConsulta
		this.fecha.add(fecha);
		this.Sintomas.add(sintomas);
		this.temperatura.add(temperatura);
		this.peso.add(peso);
		this.estatura.add(estatura);
		// End of user code
	}

	/**
	 * Description of the method receta.
	 * @param medicamentos 
	 * @param recomendaciones 
	 * @return 
	 */
	public String receta(String medicamentos, String recomendaciones) {
		// Start of user code for method receta
		String receta = "Sin nada que mostrar";
		if(medicamentos!=null  ||recomendaciones!=null){
			receta="Medicamentos: "+ medicamentos+" "+" Recomendaciones: "+ recomendaciones;
		}
		return receta;
		// End of user code
	}

	/**
	 * Description of the method sacarEdad.
	 * @param Age 
	 * @return 
	 */
	public int sacarEdad(int Age) {
		// Start of user code for method sacarEdad
	int sacarEdad=0;
		if(Age>0) {
		sacarEdad=(2021-Age);
			
		}
		return sacarEdad;
		// End of user code
	}

	// Start of user code (user defined methods for Clinica)

	// End of user code
	/**
	 * Returns Nombre.
	 * @return Nombre 
	 */
	public String getNombre() {
		return this.Nombre;
	}

	/**
	 * Sets a value to attribute Nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.Nombre = newNombre;
	}

	/**
	 * Returns rfc.
	 * @return rfc 
	 */
	public String getRfc() {
		return this.rfc;
	}

	/**
	 * Sets a value to attribute rfc. 
	 * @param newRfc 
	 */
	public void setRfc(String newRfc) {
		this.rfc = newRfc;
	}

	/**
	 * Returns fechaNac.
	 * @return fechaNac 
	 */
	public java.time.LocalDate getfechaNac() {
		return this.fechaNac;
	}

	/**
	 * Sets a value to attribute fechaNac. 
	 * @param newfechaNac 
	 */
	public void setfechaNac(java.time.LocalDate newfechaNac) {
		this.fechaNac = newfechaNac;
	}

	/**
	 * Returns fechaConsulta.
	 * @return fechaConsulta 
	 */
	public java.time.LocalDate getFechaConsulta() {
		return this.fechaConsulta;
	}

	/**
	 * Sets a value to attribute fechaConsulta. 
	 * @param newFechaConsulta 
	 */
	public void setFechaConsulta(java.time.LocalDate newFechaConsulta) {
		this.fechaConsulta = newFechaConsulta;
	}

	@Override
	public String toString() {
		return "Clinica [Nombre=" + Nombre + ", rfc=" + rfc + ", fechaNac=" + fechaNac
				+ ", fechaConsulta=" + fechaConsulta +",Consulta= Fecha de consulta"+fecha +"\n,Sintomas= "+Sintomas+" ,Temperatura="+temperatura 
				+", Peso= "+peso+", Estatura="+estatura+"]";
	}

}
