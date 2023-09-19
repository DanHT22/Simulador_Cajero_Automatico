package bbva.classes;

public class Consulta extends Interfaz {
	
	@Override
	public void Transacciones () {
		System.out.println("------------------------------------------------");
		System.out.println("Tu saldo actual es: " + getSaldo());
		System.out.println("------------------------------------------------");
	
	} // metodo Transacciones para consulta de saldo
} // class Consulta



