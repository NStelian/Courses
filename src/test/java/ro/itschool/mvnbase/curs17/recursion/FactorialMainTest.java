package ro.itschool.mvnbase.curs17.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialMainTest {
    @Test
    @DisplayName("3!=6")
    void testFactorial3() {
        Factorial fa = new Factorial();
        assertEquals(fa.factorial(3), 6);
    }

    @Test
    @DisplayName("0!=1")
    void testFactorial0() {
        Factorial fa = new Factorial();
        assertEquals(fa.factorial(0), 1);
    }
}