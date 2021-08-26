package test.java.com.incubyte;

import junit.framework.TestCase;
import main.java.com.incubyte.StringCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * test class for String Calculator
 */
class StringCalculatorTest{

    private static StringCalculator stringCalculator;

    @Before
    static void setup(){
        stringCalculator = new StringCalculator();
    }

    @Test
    void negNot(){
        UnsupportedOperationException ex = Assert.assertThrows(UnsupportedOperationException.class,() -> stringCalculator.add("-1,0,1"));
        Assert.assertEquals("Negative number(s) [-1] are not supported", ex.getMessage());
    }


    @Test
    void multipleNumSpecifiedDelimiter(){
        Assert.assertEquals(5, stringCalculator.add("//;\n2;3")
        );
    }

    @Test
    void multipleSeparatedByCommaNewLine(){
        Assert.assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    void multipleNumbersTest(){
        Assert.assertEquals(18, stringCalculator.add("5,6,7"));
        Assert.assertEquals(6, stringCalculator.add("0,1,2,3"));
    }
    @Test
    void twoNumSeparatedCommaTest() {
        Assert.assertEquals(5, stringCalculator.add("2, 3")
        );
    }

    @Test
    void singleIntegerTest(){
        Assert.assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    void nullTest(){
        Assert.assertEquals(0, stringCalculator.add(null));
    }

    @Test
    void emptyTest(){
        Assert.assertEquals(0, stringCalculator.add("")
        );
    }
}