class Transaccion {

    private String tipoTrans;
    private double monto;

    public Transaccion(String t, double m) {
        tipoTrans = t;
        monto = m;
    }

    public String getTipoTrans() {
        return tipoTrans;
    }
    public double getMonto() {
        return monto;
    }
}

Record Cliente {
    private int id;
    private String nombre;
    private double saldoActual;
    
    // Constructores, getters y setters
    public double procesarTransaccion(Transaccion trans) {
        switch (trans.getTipoTrans()) {
            case 'D':
                saldoActual += trans.getMonto();
                return saldoActual;
            case 'R':
                if (saldoActual >= trans.getMonto()) {
                    saldoActual -= trans.getMonto();
                    return saldoActual;
                } else {
                    return saldoActual;
                }
        }
    }
}

