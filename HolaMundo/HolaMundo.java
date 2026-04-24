class GestionSaldo {

    public static void main(String[] args) {
        System.out.println("--- INICIO DE TRANSACCION ---");

        // Datos del cliente
        int idCliente = 12345;
        String nombreCliente = "JUAN PEREZ";
        double saldoActual = 5000.00;

        // Simulacion de transaccion
        gestionarTransaccion('R', saldoActual);

        System.out.println("--- FIN DE PROCESO ---");
    }

    private static void gestionarTransaccion(char tipoTrans, double saldo) {
        if (tipoTrans.equals('D')) {
            saldo += 1500.50;
            System.out.println("DEPOSITO EXITOSO");
        } else if (tipoTrans.equals('R')) {
            if (saldo >= 1500.50) {
                saldo -= 1500.50;
                System.out.println("RETIRO EXITOSO");
            } else {
                System.out.println("SALDO INSUFICIENTE");
            }
        }

        System.out.println("SALDO FINAL: " + saldo);
    }
}
