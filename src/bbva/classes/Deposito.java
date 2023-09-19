package bbva.classes;

public class Deposito extends Interfaz {

	@Override
	public void Transacciones() {
		System.out.print("¿Cuánto deseas depositar?: ");
		Deposito ();
		
		transacciones = getSaldo ();
		setSaldo(transacciones + deposito);
		
		System.out.println("------------------------------------------------");
		System.out.println("Depositaste: " + deposito);
		System.out.println("Tu saldo actual es " + getSaldo());
		System.out.println("------------------------------------------------");
	
	} //  metodo Transacciones Depósito de saldo
} // class Deposito


