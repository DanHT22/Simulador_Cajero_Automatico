package bbva.classes;

import java.util.Scanner;

public abstract class Interfaz {

	protected int transacciones;
	protected int retiro;
	protected int deposito;
	private static int saldo;

	Scanner scanner = new Scanner(System.in);


	public void Operaciones() {
		int bandera = 0;
		int seleccion = 0;
		
		do {
		// Menú de opciones Do-While
			do {
				
				System.out.println("Selecciones una opción:");
				System.out.println("	1. Consulta de saldo");
				System.out.println("	2. Retiro de efectivo");
				System.out.println("	3. Depósito de efectivo");
				System.out.println("	4. Salir");
				
				seleccion = scanner.nextInt();
				
				// validar el campo
				if (seleccion >= 1 && seleccion <= 4) {
					bandera = 1;
				} else {
					System.out.println("------------------------------------------------");
					System.out.println("Opción no disponible, ingrese una opción válida.");
					System.out.println("------------------------------------------------");
				} // else 
				
			} while(bandera == 0); //do while
			
			if(seleccion == 1) {
				Interfaz interfaz = new Consulta();
				interfaz.Transacciones();
			} else if(seleccion == 2) {
				Interfaz interfaz = new Retiro();
				interfaz.Transacciones();
			} else if( seleccion == 3) {
				Interfaz interfaz = new Deposito();
				interfaz.Transacciones();
			} else if( seleccion == 4) {
				System.out.println("------------------------------------------------");
				System.out.println("	Gracias, vuelva pronto.	");
				System.out.println("------------------------------------------------");
				bandera = 2;
			} // else if
			
		} while(bandera != 2); // do while
				
	} // metodo operaciones
	
	public void Retiro () {
		retiro = scanner.nextInt();
	} // método Retiro

	public void Deposito () {
		deposito = scanner.nextInt();
	} // método Deposito
	
	public abstract void Transacciones(); // método abstracto transacciones

	public static int getSaldo() {
		return saldo;
	} // getSaldo

	public static void setSaldo(int saldo) {
		Interfaz.saldo = saldo;
	} // setSaldo
	
	
} // class Interfaz
