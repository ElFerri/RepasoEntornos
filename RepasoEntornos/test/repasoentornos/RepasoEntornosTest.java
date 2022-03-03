/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package repasoentornos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fersan
 */
public class RepasoEntornosTest {
    
    public RepasoEntornosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of multiplica method, of class RepasoEntornos.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int x = 0;
        int y = 0;
        RepasoEntornos instance = new RepasoEntornos();
        int expResult = 0;
        int result = instance.multiplica(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class RepasoEntornos.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RepasoEntornos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
