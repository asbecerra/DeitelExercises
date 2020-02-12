public class Cuenta {
	private double saldo; //variable guarda saldo
	public Cuenta(double saldoInicial) {
		if (saldoInicial > 0.0) {
			saldo = saldoInicial;
		}
	}
	public boolean cargar (double retiro) {
		if (retiro > saldo) {
			return false;
		}
		saldo = saldo - retiro;
		return true;
	}
	public void abonar(double monto) {
		saldo = saldo + monto;
	}
	public double obtenerSaldo() {
		return saldo; 
	}
}
