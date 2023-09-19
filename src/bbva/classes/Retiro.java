package bbva.classes;

public class Retiro extends Interfaz {

	@Override
	public void Transacciones() {

		System.out.print("¿Cuánto deseas retirar?: ");
		Retiro();
		// validar retiro igual o menor a saldo
		if (retiro <= getSaldo()) {
			transacciones = getSaldo();
			setSaldo(transacciones - retiro);
			System.out.println("------------------------------------------------");
			System.out.println("Retiraste: " + retiro);
			System.out.println("Tu saldo actual es: " + getSaldo());
			System.out.println("------------------------------------------------");
		} else {
			System.out.println("------------------------------------------------");
			System.out.println("Saldo insuficiente");
			System.out.println("------------------------------------------------");
		} // else

	} // metodo Transacciones Retiro de saldo
} // class Retiro

