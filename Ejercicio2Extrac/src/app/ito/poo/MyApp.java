package app.ito.poo;

import clases.ito.poo.Clinica;
import java.time.LocalDate;
public class MyApp {
	
	static void run() {
		
		Clinica c= new Clinica("Fernando", "GHJM019221H",LocalDate.of(2002, 10, 01));
		System.out.println(c+"\n");
		
		c.agregarConsulta(LocalDate.of(2020, 3, 11), "Dolor de estomago", 30, 80, 1.79f);
		System.out.println(c+"\n");
		
		System.out.println(c.receta("Paracetamol", "No comer grasas\n"));
	
		System.out.println("Edad "+c.sacarEdad(2002));
	}
	

	
	public static void main(String []args) {
		run();
	}

}