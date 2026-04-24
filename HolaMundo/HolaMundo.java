class GestionSaldo {

    public static void main(String[] args) {
        System.out.println("--- INICIO DE TRANSACCION ---");
        System.out.println("CLIENTE: Juan Perez");
        double saldoInicial = 5000.00;

        char tipoTrans = 'R';
        double monto = 1500.50;
        
        procesarTransaccion(tipoTrans, monto, saldoInicial);
        System.out.println("--- FIN DE PROCESO ---");
    }

    private static void procesarTransaccion(char tipoTrans, double monto, double saldoActual) {
        if (tipoTrans == 'D') {
            saldoActual += monto;
            System.out.println("DEPOSITO EXITOSO");
        } else if (tipoTrans == 'R') {
            if (saldoActual >= monto) {
                saldoActual -= monto;
                System.out.println("RETIRO EXITOSO");
            } else {
                System.out.println("SALDO INSUFICIENTE");
            }
        }
        System.out.println("SALDO FINAL: " + saldoActual);
    }
}
