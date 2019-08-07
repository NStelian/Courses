package ro.itschool.mvnbase.curs17.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciMainTest {
    @Test
    @DisplayName("fib(3)=2")
    void testFib3() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(fibonacci.fib(3), 2);
    }

    @Test
    @DisplayName("fib(20)=6765")
    void testFib20() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(fibonacci.fib(20), 6765);
    }

    @Test
    @DisplayName("fib(0)=0")
    void testFib0() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(fibonacci.fib(0), 0);
    }

    @Test
    @DisplayName("fib(1)=1")
    void testFib1() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(fibonacci.fib(1), 1);
    }

}