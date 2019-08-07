package ro.itschool.mvnbase.curs18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromOneIndexTest {
    protected Palindrome palindrome;

    @BeforeEach
    void setup() {
        palindrome = new PalindromeOneIndex();
    }

    @Test
    @DisplayName("mama is not palindrome")
    public void notPalindrome() {
        assertFalse(palindrome.check("mama"));
    }

    @Test
    @DisplayName("Ana is palindrome")
    public void correctPalindrome() {
        assertTrue(palindrome.check("Ana"));
    }

    @Test
    @DisplayName("a is palindrome")
    public void singleLetter() {
        assertTrue(palindrome.check("a"));
    }

    @Test
    @DisplayName(" '' is palindrome")
    public void empryString() {
        assertTrue(palindrome.check(""));
    }

    @Test
    @DisplayName("null is not palindrome")
    public void nullString() {
        assertFalse(palindrome.check(null));
    }

    @Test
    @DisplayName("annna is palindrome")
    public void correctPalindrome2() {
        assertTrue(palindrome.check("annna"));
    }

}