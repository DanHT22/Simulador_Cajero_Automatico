package bbva;

import bbva.classes.Consulta;
import bbva.classes.Interfaz;

public class TestCajeroAutomatico {

	public static void main(String[] args) {
		
		Interfaz interfaz = new Consulta();
		Interfaz.setSaldo(500);
		interfaz.Operaciones();
		
	} // main

} // class TestCajeroAutomatico

