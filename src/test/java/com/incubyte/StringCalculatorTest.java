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
    void nullTest(){
        Assert.assertEquals(0, stringCalculator.add(null));
    }

    @Test
    void emptyTest(){
        Assert.assertEquals(0, stringCalculator.add("")
        );
    }
}