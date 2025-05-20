package operaciones;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculadoraTest {
    static Calculadora calc;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass()");
        calc = new Calculadora();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass()");
    }

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
        System.out.println("método testSum()");
        int result = calc.add(3, 2);
        int esper = 5;
        assertEquals(esper, result);
    }

    @Test
    public void testAnsSum() {
        System.out.println("método testAnsSum()");
        calc.add(3, 2);
        int result = calc.ans();
        int esper = 5;
        assertEquals(esper, result);
    }

    @Test
    public void testDiv() {
        System.out.println("método testDiv()");
        int result = calc.div(5, 2);
        int esper = 2;
        assertEquals(esper, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivPorCero() {
        System.out.println("método testDivPorCero()");
        calc.div(5, 0);
    }

    @Test(timeout = 100)
    public void testAlgoritmoOptimo() {
        System.out.println("método testAlgoritmoOptimo()");
        calc.operacionOptima();
    }
}