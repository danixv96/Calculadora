

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

    @Test
    public void suma()
    {
    Calculadora calculadora = new Calculadora();
    calculadora.n1(2);
    calculadora.n2(4);
    calculadora.ponOperacion("SUMA");
    calculadora.opera();
    assertEquals(6, calculadora.dameResultado());

    calculadora.n1(-2);
    calculadora.n2(-4);
    calculadora.ponOperacion("SUMA");
    calculadora.opera();
    assertEquals(-6, calculadora.dameResultado());
 
    calculadora.n1(-2);
    calculadora.n2(4);
    calculadora.ponOperacion("SUMA");
    calculadora.opera();
    assertEquals(2, calculadora.dameResultado());

    calculadora.n1(0);
    calculadora.n2(-3);
    calculadora.ponOperacion("SUMA");
    calculadora.opera();
    assertEquals(-3, calculadora.dameResultado());
    }
	
    @Test
    public void resta()
    {
    Calculadora calculadora = new Calculadora();
    calculadora.n1(10);
    calculadora.n2(6);
    calculadora.ponOperacion("RESTA");
    calculadora.opera();
    assertEquals(4, calculadora.dameResultado());

    calculadora.n1(-10);
    calculadora.n2(-6);
    calculadora.ponOperacion("RESTA");
    calculadora.opera();
    assertEquals(-4, calculadora.dameResultado());

    calculadora.n1(0);
    calculadora.n2(2);
    calculadora.ponOperacion("RESTA");
    calculadora.opera();
    assertEquals(-2, calculadora.dameResultado());

    calculadora.n1(2);
    calculadora.n2(0);
    calculadora.ponOperacion("RESTA");
    calculadora.opera();
    assertEquals(2, calculadora.dameResultado());
    }

    @Test
    public void multiplicacion()
    {
    Calculadora calculadora = new Calculadora();
    calculadora.n1(2);
    calculadora.n2(4);
    calculadora.ponOperacion("MULTIPLICACION");
    calculadora.opera();
    assertEquals(8, calculadora.dameResultado());

    calculadora.n1(-2);
    calculadora.n2(-3);
    calculadora.ponOperacion("MULTIPLICACION");
    calculadora.opera();
    assertEquals(6, calculadora.dameResultado());

    calculadora.n1(2);
    calculadora.n2(0);
    calculadora.ponOperacion("MULTIPLICACION");
    calculadora.opera();
    assertEquals(0, calculadora.dameResultado());

    calculadora.n1(-5);
    calculadora.n2(4);
    calculadora.ponOperacion("MULTIPLICACION");
    calculadora.opera();
    assertEquals(-20, calculadora.dameResultado());
    }
}
