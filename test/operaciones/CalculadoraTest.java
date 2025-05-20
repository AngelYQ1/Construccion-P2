package operaciones;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {
    Calculadora calc;

    @Before
    public void before() {
        System.out.println("before()");
        calc = new Calculadora();
    }

    @After
    public void after() {
        System.out.println("after()");
        calc.clear();
    }

    @Test
    public void testSum() {
        int result = calc.add(3, 2);
        int esper = 5;
        assertEquals(esper, result);
    }

    @Test
    public void testAnsSum() {
        System.out.println("ansSum()");
        calc.add(3, 2);
        int result = calc.ans();
        int esper = 5;
        assertEquals(esper, result);
    }

    @Test
    public void testDiv() {
        calc.div(5, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivPorCero() {
        calc.div(5, 3);
    }
}

