package ro.itschool.mvnbase.curs17.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumMainTest {
    @Test
    @DisplayName("sum(5) = 15")
    void test5() {
        Sum s = new Sum();
        assertEquals(s.sum(5), 15);
    }

    @Test
    @DisplayName("sum(0) = 0")
    void test0() {
        Sum s = new Sum();
        assertEquals(s.sum(0), 0);
    }

}