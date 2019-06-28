package ro.itschool.mvnbase.Curs6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTDDTest {
    @Test
    @DisplayName("WHEN adding two zeros then zero is returned")
    void addingZeroReturnsZero(){
        //SETUP
        CalculatorTDD calculator = new CalculatorTDD();

        //RUN
        int result = calculator.add(0,0);

        //ASSERT
        assertTrue(result==0);
    }

    @Test
    @DisplayName("WHEN adding two positive numbers THEN their sum is returned")
    void addingTwoPositiveReturnsSum(){
        //SETUP
    CalculatorTDD calculator = new CalculatorTDD();
    //RUN
    int result = calculator.add(4,5);

    //ASSERT
    assertEquals(9,result);
    }

    @Test
    @DisplayName("WHEN divisioning two positive numbers THEN their division is returned")
    void divisioningTwoPositiveReturnsDiv(){
        //SETUP
        CalculatorTDD calculator = new CalculatorTDD();
        //RUN
        int result = calculator.division(20,5);

        //ASSERT
        assertEquals(4,result);
    }

    @Test
    @DisplayName("WHEN 0 is divided THEN return 0")
    void divisioningNumberWithZero(){
        //SETUP
        CalculatorTDD calculator = new CalculatorTDD();
        //RUN
        int result = calculator.division(0,5);

        //ASSERT
        assertEquals(0,result);
    }

    @Test
    @DisplayName("WHEN dividing with 0 then return 0")
    void divisionByZero(){
        //SETUP
        CalculatorTDD calculator = new CalculatorTDD();
        //RUN
        int result = calculator.division(5,0);

        //ASSERT
        assertEquals(0,result);
    }

}