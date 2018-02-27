

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
    private int num1;
    private int num2;
    private int rdo;
    private Operacion op;
    
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

    public void  testSuma() { 
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print( "Introduce el segundo número: " );
        int num2 = teclado.nextInt();
        System.out.print( "Su suma es: " );
        System.out.println(n1+n2);
          
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
