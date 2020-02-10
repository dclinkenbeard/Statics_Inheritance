import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StormtrooperTest {

    @Test
    void initializer(){
        assertEquals(0, Stormtrooper.getCount());
        Stormtrooper trooper = null;
        assertEquals(null,trooper);
        trooper = new Stormtrooper();
        assertEquals(Stormtrooper.class, trooper.getClass());
        assertEquals(1, Stormtrooper.getCount());
    }

    @Test
    void attack() {
        Stormtrooper fn2187 = new Stormtrooper();
        assertFalse(fn2187.attack(3));
        assertFalse(fn2187.attack(18));
        assertTrue(fn2187.attack(19));
        assertTrue(fn2187.attack(20));
    }
}