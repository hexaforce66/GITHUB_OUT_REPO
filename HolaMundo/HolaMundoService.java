Se proporciona un ejemplo de código Java con Spring Boot actual para demostrar la lógica de negocio del programa COBOL reescrito.

```java
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class GestionSaldoController {

    @PostMapping(value = "/gestionar")
    public Map<String, Object> gestionarSaldo(@RequestBody Map<String, Object> solicitud) {
        Map<String, Object> respuesta = new HashMap<>();

        String cliente = (String) solicitud.get("cliente");
        BigDecimal saldoActual = (BigDecimal) solicitud.get("saldoActual");
        BigDecimal monto = (BigDecimal) solicitud.get("monto");

        switch ((char) solicitud.get("tipoTrans")) {
            case 'D':
                saldoActual = saldoActual.add(monto);
                respuesta.put("mensaje", "DEPOSITO EXITOSO");
                break;
            case 'R':
                if (saldoActual.compareTo(monto) >= 0) {
                    saldoActual = saldoActual.subtract(monto);
                    respuesta.put("mensaje", "RETIRO EXITOSO");
                } else {
                    respuesta.put("mensaje", "SALDO INSUFICIENTE");
                }
                break;
        }

        respuesta.put("saldoFinal", saldoActual);
        return respuesta;
    }
}
```