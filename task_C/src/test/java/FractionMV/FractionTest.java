package FractionMV;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Unit test for simple App.
 */

public class FractionTest {

    private Fraction fraction;
    private Integer result;

    @Test
    public void testSimplify1() {
        Integer numerator = 12;
        Integer dominator = 30;
        fraction = new Fraction(numerator, dominator);
        fraction.Simplify();
        assertEquals(2, fraction.getNumerator());
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    public void testSimplify2() {
        Integer numerator = -25;
        Integer dominator = 7;
        fraction = new Fraction(numerator, dominator);
        fraction.Simplify();
        assertEquals(-25, fraction.getNumerator());
        assertEquals(7, fraction.getDenominator());
    }


    @Test
    public void testDenominator1() {
        Integer numerator = 12;
        Integer dominator = 30;
        fraction = new Fraction(numerator, dominator);
        result = fraction.getDenominator();
        assertTrue("getDenominator() returned " + result + " instead of 30.", result == 30);
    }

    @Test
    public void testDenominator2() {
        Integer numerator = -25;
        Integer dominator = 7;
        fraction = new Fraction(numerator, dominator);
        result = fraction.getNumerator();
        assertEquals(7, result);
    }

    @Test
    public void testSetDenominator1() {
        Integer numerator = 12;
        Integer dominator = 30;
        fraction = new Fraction(numerator, dominator);
        fraction.setDenominator(1);
        result = fraction.getDenominator();
        assertTrue("getDenominator() returned " + result + " instead of 1.", result == 1);
    }

    @Test
    public void testSetDenominator2() {
        Integer numerator = -25;
        Integer dominator = 7;
        fraction = new Fraction(numerator, dominator);
        fraction.setNumerator(6);
        result = fraction.getNumerator();
        assertEquals(6, result);
    }

    public String[] getNumbersFromFile(String numbersFile) throws IOException {
        int n = 0;
        BufferedReader in = new BufferedReader(new FileReader(numbersFile));
        while ((in.readLine()) != null) {
            n++;
        }
        in.close();

        String[] la = new String[n];
        String s = new String();
        int i = 0;
        in = new BufferedReader(new FileReader(numbersFile));
        while ((s = in.readLine()) != null) {
            la[i] = s;
            i++;
        }
        in.close();
        return la;
    }
}