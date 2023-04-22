package es.makigas.ejemplos.optional;

import es.makigas.ejemplos.common.Factura;
import java.util.Optional;

public class Main {
    
    private static ProveedorOpcional prov = new ProveedorOpcional();
    
    public static void main(String[] args) {
        Optional<Factura> lunes = prov.getFactura(DiaSemana.LUNES);
        Optional<Factura> domingo = prov.getFactura(DiaSemana.DOMINGO);
        
        if (lunes.isEmpty()) {
            System.out.println("El lunes está vacío");
        } else {
            System.out.println("El lunes tiene cosas");
            System.out.println(lunes.orElseThrow());
        }
        
        if (domingo.isEmpty()) {
            System.out.println("El domingo está vacío");
        } else {
            System.out.println("El domingo tiene cosas");
            System.out.println(domingo.orElseThrow());
        }
        
        lunes.ifPresent(f -> {
            System.out.println("En el ifPresent del lunes");
            System.out.println(f);
        });
        
        domingo.ifPresent(f -> {
            System.out.println("En el ifPresent del domingo");
            System.out.println(f);
        });
        
        Factura fallbackLunes = lunes.orElse(new Factura("0000", 0));
        System.out.println("Factura de lunes: " + fallbackLunes);
        
        Factura fallbackDomingo = domingo.orElse(new Factura("0000", 0));
        System.out.println("Factura de domingo: " + fallbackDomingo);
    }
    
}
