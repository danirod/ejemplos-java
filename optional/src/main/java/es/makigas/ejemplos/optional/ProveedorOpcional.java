package es.makigas.ejemplos.optional;

import es.makigas.ejemplos.common.Factura;
import java.util.Optional;

public class ProveedorOpcional {
    
    private ProveedorFactura delegator = new ProveedorFactura();
    
    public Optional<Factura> getFactura(DiaSemana dia) {
        if (dia == DiaSemana.SABADO || dia == DiaSemana.DOMINGO) {
            return Optional.empty();
        } else {
            Factura f = delegator.getFactura(dia);
            return Optional.of(f);
        }
    }
    
}
