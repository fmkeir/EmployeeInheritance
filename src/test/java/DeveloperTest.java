import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Alan", "PQ1234Z", 30000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Alan", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("PQ1234Z", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, developer.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        developer.setName("Joe");
        assertEquals("Joe", developer.getName());
    }

    @Test
    public void cantChangeNameIfBlank() {
        developer.setName("");
        assertEquals("Alan", developer.getName());
        developer.setName(null);
        assertEquals("Alan", developer.getName());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(20000.00);
        assertEquals(50000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300, developer.payBonus(), 0.01);
    }
}
