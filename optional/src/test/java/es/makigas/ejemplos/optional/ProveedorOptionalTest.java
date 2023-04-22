package es.makigas.ejemplos.optional;

import es.makigas.ejemplos.common.Factura;
import java.util.NoSuchElementException;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@SuppressWarnings("ThrowableResultIgnored")
public class ProveedorOptionalTest
{
    ProveedorOpcional prov = new ProveedorOpcional();
    
    @Nested
    public class MetodoGet
    {
        @Test
        public void testPresent() {
            Optional<Factura> factura = prov.getFactura(DiaSemana.LUNES);
            Factura fact = factura.get();
            assertNotNull(fact);
            System.out.println("Factura: " + fact);
        }
        
        @Test
        public void testEmpty() {
            Optional<Factura> factura = prov.getFactura(DiaSemana.DOMINGO);
            assertThrows(NoSuchElementException.class, () -> {
                Factura fact = factura.get();
                System.out.println("Factura: " + fact);
            });
        }
    }
    
    @Nested
    public class MetodoOrElseThrow
    {
        @Test
        public void testPresent() {
            Optional<Factura> factura = prov.getFactura(DiaSemana.LUNES);
            Factura fact = factura.orElseThrow();
            assertNotNull(fact);
            System.out.println("Factura: " + fact);
        }
        
        @Test
        public void testEmpty() {
            Optional<Factura> factura = prov.getFactura(DiaSemana.DOMINGO);
            assertThrows(NoSuchElementException.class, () -> {
                Factura fact = factura.orElseThrow();
                System.out.println("Factura: " + fact);
            });
        }
    }
    
    @Nested
    public class MetodoIsPresent
    {
        @Test
        public void testPresent() {
            Optional<Factura> factura = prov.getFactura(DiaSemana.LUNES);
            assertTrue(factura.isPresent());
        }
        
        @Test
        public void testEmpty() {
            Optional<Factura> factura = prov.getFactura(DiaSemana.DOMINGO);
            assertFalse(factura.isPresent());
        }
    }
    
    @Nested
    public class MetodoIsEmpty
    {
        @Test
        public void testPresent() {
            Optional<Factura> factura = prov.getFactura(DiaSemana.LUNES);
            assertFalse(factura.isEmpty());
        }
        
        @Test
        public void testEmpty() {
            Optional<Factura> factura = prov.getFactura(DiaSemana.DOMINGO);
            assertTrue(factura.isEmpty());
        }
    }
}
