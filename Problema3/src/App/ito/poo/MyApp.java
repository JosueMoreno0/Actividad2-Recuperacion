package App.ito.poo;
import java.time.LocalDate;


import ito.poo.clases.lineatransporte;

import ito.poo.clases.controlViajes;



public class MyApp {
	
	static void run() {
		lineatransporte lineac=(new lineatransporte("Mercedez",2006,2000,LocalDate.of(2019, 03, 22), "Sin viajes" ));
		System.out.println (lineac);
		controlViajes viajesc=(new controlViajes("Sonora","Av Venustiano #31",LocalDate.of(2020, 10, 12),LocalDate.of(2020, 10, 16),1500,"Telas"));
		System.out.println (viajesc);
	}

	
	public static void main(String[] args) {
		run();
	}
}
