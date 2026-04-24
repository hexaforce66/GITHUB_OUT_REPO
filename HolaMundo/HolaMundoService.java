class Transaccion { 
	private String tipo;
	private double monto;

	public Transaccion(String t, double m) { tipo = t; monto = m; }

	public double procesarTransaccion(double saldoActual) {
		switch(tipo) {
		case 'D':
			return saldoActual + monto;
		case 'R':
			si (saldoActual >= monto) {
				return saldoActual - monto;
			} else {
			return saldoActual;
			}
		default:
			return saldoActual;
		}
	}
}

