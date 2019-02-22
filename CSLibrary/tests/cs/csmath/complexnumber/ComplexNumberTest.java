package cs.csmath.complexnumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexNumberTest {
    static final double DELTA = 0.000001;
    @Test
    public void testPositiveGetRealPart() {
        ComplexNumber cn = new ComplexNumber(1.0, 1.0);
        double realPart = cn.getRealPart();
        assertEquals(1.0, realPart, DELTA);
    }

    @Test
    public void testNegativeGetRealPart() {
        ComplexNumber cn = new ComplexNumber(-1.0, 1.0);
        double realPart = cn.getRealPart();
        assertEquals(-1.0, realPart, DELTA);
    }

    @Test
    public void testZeroGetRealPart() {
        ComplexNumber cn = new ComplexNumber(0.0, 1.0);
        double realPart = cn.getRealPart();
        assertEquals(0.0, realPart, DELTA);
    }

    @Test
    public void testPositiveSetRealPart() {
            ComplexNumber cn = new ComplexNumber();
            cn.setRealPart(2.0);
            assertEquals(2.0, cn.getRealPart(), DELTA);
    }

    @Test
    public void testNegativeSetRealPart() {
        ComplexNumber cn = new ComplexNumber();
        cn.setRealPart(-2.0);
        assertEquals(-2.0, cn.getRealPart(), DELTA);
    }

    @Test
    public void testZeroSetRealPart() {
        ComplexNumber cn = new ComplexNumber();
        cn.setRealPart(0.0);
        assertEquals(0.0, cn.getRealPart(), DELTA);
    }

    @Test
    public void testPositiveGetImagPart() {
        ComplexNumber cn = new ComplexNumber(1.0, 1.0);
        double imagPart = cn.getImagPart();
        assertEquals(1.0, imagPart, DELTA);
    }

    @Test
    public void testNegativeGetImagPart() {
        ComplexNumber cn = new ComplexNumber(1.0, -1.0);
        double imagPart = cn.getImagPart();
        assertEquals(-1.0, imagPart, DELTA);
    }

    @Test
    public void testZeroGetImagPart() {
        ComplexNumber cn = new ComplexNumber(1.0, 0.0);
        double imagPart = cn.getImagPart();
        assertEquals(0.0, imagPart, DELTA);
    }

    @Test
    public void testPositiveSetImagPart() {
        ComplexNumber cn = new ComplexNumber();
        cn.setImagPart(2.0);
        assertEquals(2.0, cn.getImagPart(), DELTA);
    }

    @Test
    public void testNegativeSetImagPart() {
        ComplexNumber cn = new ComplexNumber();
        cn.setImagPart(-2.0);
        assertEquals(-2.0, cn.getImagPart(), DELTA);
    }

    @Test
    public void testZeroSetImagPart() {
        ComplexNumber cn = new ComplexNumber();
        cn.setImagPart(0.0);
        assertEquals(0.0, cn.getImagPart(), DELTA);
    }

    @Test
    public void testPositiveAdd() {
        ComplexNumber cn1 = new ComplexNumber(3.0, 4.5);
        ComplexNumber cn2 = new ComplexNumber(1.4, 2.0);
        cn1.add(cn2);
        assertEquals(4.4, cn1.getRealPart(), DELTA);
        assertEquals(6.5, cn1.getImagPart(), DELTA);
    }

    @Test
    public void testNegativeAdd(){
        ComplexNumber cn1 = new ComplexNumber(3.0, -4.5);
        ComplexNumber cn2 = new ComplexNumber(-1.4, 2.0);
        cn1.add(cn2);
        assertEquals(1.6, cn1.getRealPart(), DELTA);
        assertEquals(-2.5, cn1.getImagPart(), DELTA);
    }

    @Test
    public void testZeroAdd(){
        ComplexNumber cn1 = new ComplexNumber(3.0, 0);
        ComplexNumber cn2 = new ComplexNumber(0, 2.0);
        cn1.add(cn2);
        assertEquals(3.0, cn1.getRealPart(), DELTA);
        assertEquals(2.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void testPositiveSub() {
        ComplexNumber cn1 = new ComplexNumber(3.0, 4.5);
        ComplexNumber cn2 = new ComplexNumber(1.4, 2.0);
        cn1.sub(cn2);
        assertEquals(1.6, cn1.getRealPart(), DELTA);
        assertEquals(2.5, cn1.getImagPart(), DELTA);
    }

    @Test
    public void testZeroSub() {
        ComplexNumber cn1 = new ComplexNumber(3.0, 0);
        ComplexNumber cn2 = new ComplexNumber(0, 2.0);
        cn1.sub(cn2);
        assertEquals(3.0, cn1.getRealPart(), DELTA);
        assertEquals(-2.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void testNegativeSub(){
        ComplexNumber cn1 = new ComplexNumber(3.0, -4.5);
        ComplexNumber cn2 = new ComplexNumber(-1.4, 2.0);
        cn1.sub(cn2);
        assertEquals(4.4, cn1.getRealPart(), DELTA);
        assertEquals(-6.5, cn1.getImagPart(), DELTA);
    }

    @Test
    public void testPositiveMult() {
        ComplexNumber cn1 = new ComplexNumber(3.0, 4.5);
        ComplexNumber cn2 = new ComplexNumber(1.4, 2.0);
        cn1.mult(cn2);
        assertEquals(-4.8, cn1.getRealPart(), DELTA);
        assertEquals(12.3, cn1.getImagPart(), DELTA);
    }

    @Test
    public void testNegativeMult() {
        ComplexNumber cn1 = new ComplexNumber(3.0, -4.5);
        ComplexNumber cn2 = new ComplexNumber(-1.4, 2.0);
        cn1.mult(cn2);
        assertEquals(4.8, cn1.getRealPart(), DELTA);
        assertEquals(12.3, cn1.getImagPart(), DELTA);
    }

    @Test
    public void testZeroMult() {
        ComplexNumber cn1 = new ComplexNumber(0.0, 4.5);
        ComplexNumber cn2 = new ComplexNumber(1.4, 0.0);
        cn1.mult(cn2);
        assertEquals(0.0, cn1.getRealPart(), DELTA);
        assertEquals(6.3, cn1.getImagPart(), DELTA);
    }

    @Test
    public void testPositiveDiv() {
        ComplexNumber cn1 = new ComplexNumber(3.0, 4.5);
        ComplexNumber cn2 = new ComplexNumber(1.5, 2.0);
        cn1.div(cn2);
        assertEquals(2.16, cn1.getRealPart(), DELTA);
        assertEquals(0.12, cn1.getImagPart(), DELTA);
    }

    @Test
    public void testNegativeDiv() {
        ComplexNumber cn1 = new ComplexNumber(3.0, -4.5);
        ComplexNumber cn2 = new ComplexNumber(-1.5, 2.0);
        cn1.div(cn2);
        assertEquals(-2.16, cn1.getRealPart(), DELTA);
        assertEquals(0.12, cn1.getImagPart(), DELTA);
    }

    @Test
    public void testZeroDiv() {
        ComplexNumber cn1 = new ComplexNumber(3.0, 4.5);
        ComplexNumber cn2 = new ComplexNumber(0.0, 0.0);
        try {
            cn1.div(cn2);
            fail();
        }
        catch(ArithmeticException e){}
    }

    @Test
    public void testPositiveAbs() {
        ComplexNumber cn = new ComplexNumber(3.0, 4.0);
        double absCN = cn.abs();
        assertEquals(5, absCN, DELTA);
    }

    @Test
    public void testNegativeAbs() {
        ComplexNumber cn = new ComplexNumber(-3.0, -4.0);
        double absCN = cn.abs();
        assertEquals(5, absCN, DELTA);
    }

    @Test
    public void testZeroAbs() {
        ComplexNumber cn = new ComplexNumber(0.0, 0.0);
        double absCN = cn.abs();
        assertEquals(0, absCN, DELTA);
    }

    @Test
    public void testPositiveConj() {
        ComplexNumber cn = new ComplexNumber(3.0, 4.0);
        ComplexNumber conjCN = cn.conj();
        assertEquals(3.0, conjCN.getRealPart(), DELTA);
        assertEquals(-4.0, conjCN.getImagPart(), DELTA);
    }

    @Test
    public void testNegativeConj() {
        ComplexNumber cn = new ComplexNumber(-3.0, -4.0);
        ComplexNumber conjCN = cn.conj();
        assertEquals(-3.0, conjCN.getRealPart(), DELTA);
        assertEquals(4.0, conjCN.getImagPart(), DELTA);
    }

    @Test
    public void testZeroConj() {
        ComplexNumber cn = new ComplexNumber(3.0, 0.0);
        ComplexNumber conjCN = cn.conj();
        assertEquals(3.0, conjCN.getRealPart(), DELTA);
        assertEquals(0.0, conjCN.getImagPart(), DELTA);
    }

    @Test
    public void testStaticAdd(){
        ComplexNumber cn1 = new ComplexNumber(3.0, 4.5);
        ComplexNumber cn2 = new ComplexNumber(1.4, 2.0);
        ComplexNumber result = ComplexNumber.add(cn1, cn2);
        assertEquals("Assert real part", 4.4, result.getRealPart(), DELTA);
        assertEquals("Assert imaginary part",6.5, result.getImagPart(), DELTA);
    }
}