package es.makigas.ejemplos.genericos;

import es.makigas.ejemplos.common.Department;
import es.makigas.ejemplos.common.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnvoltorioTest {

    @Test
    public void testEnvuelveEmpleado() {
        Department dep = new Department(123, "Contabilidad", "Europa");
        Employee empl = new Employee("Foo", "Bar", dep);
        Envoltorio<Employee> env = new Envoltorio<>(empl);
        Assertions.assertTrue(env.toString().contains("Envolvemos ["));
        
         Assertions.assertEquals("Foo", env.get().name());
    }
    
    @Test
    public void testEnvuelveDepartamento() {
         Department dep = new Department(123, "Contabilidad", "Europa");
         Envoltorio<Department> env = new Envoltorio<>(dep);
         Assertions.assertTrue(env.toString().contains("Envolvemos ["));
         
         Assertions.assertEquals("Europa", env.get().location());
    }
    
}
