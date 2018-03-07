

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;

/**
 * The test class CalculadoraTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalculadoraTest
{ 

    
    public CalculadoraTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    @After
    public void suma()
    {
    Calculadora calculadora = new Calculadora();
    calculadora.n1(2);
    calculadora.n2(4);
    calculadora.ponOperacion("SUMA");
    calculadora.opera();
    assertEquals(6, calculadora.dameResultado());
    }

    public void resta()
    {
    Calculadora calculadora = new Calculadora();
    calculadora.n1(10);
    calculadora.n2(6);
    calculadora.ponOperacion("RESTA");
    calculadora.opera();
    assertEquals(4, calculadora.dameResultado());
    }
}
