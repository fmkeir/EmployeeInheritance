import org.junit.Before;
import org.junit.Test;
import management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void before() {
        director = new Director("Theodore", "AB4567I", 50000.00, 100000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Theodore", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("AB4567I", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, director.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        director.setName("Sarah");
        assertEquals("Sarah", director.getName());
    }

    @Test
    public void cantChangeNameIfBlank() {
        director.setName("");
        assertEquals("Theodore", director.getName());
        director.setName(null);
        assertEquals("Theodore", director.getName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000.00);
        assertEquals(60000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000, director.payBonus(), 0.01);
    }
}
