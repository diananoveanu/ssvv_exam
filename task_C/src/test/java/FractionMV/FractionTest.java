package FractionMV;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {
    @Test
    public void testSimplify_Simplified() {
        System.out.println("Test .... Test_testSimplify_Simplified");
        Fraction fraction = new Fraction(12, 30);
        fraction.Simplify();
        int simplifiedNumerator = fraction.getNumerator();
        int simplifiedDenominator = fraction.getDenominator();
        assertEquals("Simplify() returned numerator: " + simplifiedNumerator + " instead of 2.", 2, simplifiedNumerator);
        assertEquals("Simplify() returned denominator: " + simplifiedDenominator + " instead of 5.", 5, simplifiedDenominator);
    }

    @Test
    public void testSimplify_Unsimplified() {
        System.out.println("Test .... Test_testSimplify_Unsimplified");
        Fraction fraction = new Fraction(-25, 7);
        fraction.Simplify();
        int simplifiedNumerator = fraction.getNumerator();
        int simplifiedDenominator = fraction.getDenominator();
        assertEquals("Simplify() returned numerator: " + simplifiedNumerator + " instead of -25.", -25, fraction.getNumerator());
        assertEquals("Simplify() returned denominator: " + simplifiedDenominator + " instead of 7.", 7, fraction.getDenominator());
    }

    @Test
    public void testGetDenominator() {
        System.out.println("Test .... Test_testGetDenominator");
        int numerator = 12;
        int denominator = 30;
        Fraction fraction = new Fraction(numerator, denominator);
        int result = fraction.getDenominator();
        assertEquals("getDenominator() returned " + result + " instead of 30.", 30, result);
    }

    @Test
    public void testGetNumerator() {
        System.out.println("Test .... Test_testGetNumerator");
        int numerator = -25;
        int dominator = 7;
        Fraction fraction = new Fraction(numerator, dominator);
        int result = fraction.getNumerator();
        assertEquals("getNumerator() returned " + result + " instead of -25.", -25, result);
    }

    @Test
    public void testSetDenominator() {
        System.out.println("Test .... Test_testSetDenominator");
        int numerator = 12;
        int dominator = 30;
        Fraction fraction = new Fraction(numerator, dominator);
        fraction.setDenominator(1);
        int result = fraction.getDenominator();
        assertEquals("setDenominator() returned " + result + " instead of 1.", 1, result);
    }

    @Test
    public void testSetNumerator() {
        System.out.println("Test .... Test_testSetNumerator");
        int numerator = -25;
        int dominator = 7;
        Fraction fraction = new Fraction(numerator, dominator);
        fraction.setNumerator(6);
        int result = fraction.getNumerator();
        assertEquals("setNumerator() returned " + result + " instead of 6.", 6, result);
    }
}