package ro.itschool.mvnbase.curs17.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowMainTest {
    @Test
    @DisplayName("2^3=8")
    void test() {
        Pow p = new Pow();
        assertEquals(p.pow(2, 3), 8);
    }

    @Test
    @DisplayName("2^0=1")
    void testAt0() {
        Pow p = new Pow();
        assertEquals(p.pow(2, 0), 1);
    }

    @Test
    @DisplayName("2^1=1")
    void testAt1() {
        Pow p = new Pow();
        assertEquals(p.pow(2, 1), 2);
    }

    @Test
    @DisplayName("-2^2=4")
    void testNegativeAtPositive() {
        Pow p = new Pow();
        assertEquals(p.pow(-2, 2), 4);
    }
}