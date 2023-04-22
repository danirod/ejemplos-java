package es.makigas.ejemplos.optional;

import es.makigas.ejemplos.common.Factura;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProveedorFacturaTest {

    ProveedorFactura prov = new ProveedorFactura();
    
    @Test
    public void testEntreSemana() {
        Factura f = prov.getFactura(DiaSemana.LUNES);
        System.out.println("Factura: " + f);
        System.out.println("Total a pagar: " + f.precioTotal());
    }
    
    @Test
    @SuppressWarnings("ThrowableResultIgnored")
    public void testFinDeSemana() {
        assertThrows(NullPointerException.class, () -> {
            Factura f = prov.getFactura(DiaSemana.DOMINGO);
            System.out.println("Factura: " + f);
            System.out.println("Total a pagar: " + f.precioTotal());
        });
    }
    
}
