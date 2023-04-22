package es.makigas.ejemplos.optional;

import es.makigas.ejemplos.common.Factura;
import java.util.Random;

public class ProveedorFactura {
    
    public Factura getFactura(DiaSemana dia) {
        if (dia == DiaSemana.SABADO || dia == DiaSemana.DOMINGO) {
            return null;
        } else {
            return generarFactura();
        }
    }
    
    private Factura generarFactura() {
        Random rand = new Random();
        String id = "F-2023-" + rand.nextInt(1000, 9999);
        int precio = rand.nextInt(2000, 4000);
        return new Factura(id, precio);
    }
    
}
