package ro.itschool.mvnbase.curs17.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringLengthMainTest {
    @Test
    @DisplayName("StringLenght(nene)=4")
    void test() {
        StringLenght sl = new StringLenght();
        assertEquals(sl.stringLenght("nene"), 4);
    }

}