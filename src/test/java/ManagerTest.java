import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("James", "XX4451P", 40000.00, "Bananas");
    }

    @Test
    public void hasName() {
        assertEquals("James", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("XX4451P", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Bananas", manager.getDeptName());
    }

    @Test
    public void canChangeName() {
        manager.setName("Steve");
        assertEquals("Steve", manager.getName());
    }

    @Test
    public void cantChangeNameIfBlank() {
        manager.setName("");
        assertEquals("James", manager.getName());
        manager.setName(null);
        assertEquals("James", manager.getName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10000.00);
        assertEquals(50000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400, manager.payBonus(), 0.01);
    }
}
