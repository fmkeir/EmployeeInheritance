import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Andrew", "AB7890Y", 25000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Andrew", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("AB7890Y", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Stuart");
        assertEquals("Stuart", databaseAdmin.getName());
    }

    @Test
    public void cantChangeNameIfBlank() {
        databaseAdmin.setName("");
        assertEquals("Andrew", databaseAdmin.getName());
        databaseAdmin.setName(null);
        assertEquals("Andrew", databaseAdmin.getName());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(5000.00);
        assertEquals(30000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250, databaseAdmin.payBonus(), 0.01);
    }
}
