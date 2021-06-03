package app.ito.poo;

import java.util.Date;
import clases.ito.poo.Composicion;

public class MyApp {

	static void run() {

		Composicion composicion1 = new Composicion ("Hola", 3.17f,"Banda", new Date(), new Date());
	
		composicion1.PedirCompositor("Saul Fernandez");
		System.out.println(composicion1);	
	}
	
	public static void main(String[] args) {
		run();
	} 

}
