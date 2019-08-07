package ro.itschool.mvnbase.curs18;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeStackTest extends PalindromOneIndexTest{
    @Override
    @BeforeEach
    void setup() {
        palindrome = new PalindromeStack();
    }
}