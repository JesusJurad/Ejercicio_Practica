/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author javier Bustamante Toledo
 */
public class Ejercicio1PruebasPorEquivalenciasIT {
    
    private Ejercicio1 instance;
    
    public Ejercicio1PruebasPorEquivalenciasIT() {
    }
    
    @Before
    public void setUp(){
        System.out.println("SetUp => Before");
        instance = new Ejercicio1();
    }
    
    @After
    public void tearDown(){
        System.out.println("TearDown => After");
        instance = null;
    }
    
    @Test
    public void testCaso3_1() {
        String expResult = "Cadena incorrecta. La longuitud de la cadena es < 6";
        String result = instance.IntroducirCadena("cinco");
        assertEquals(expResult, result);
    }
    @Test
    public void testCaso3_2() {
        String expResult = "Cadena incorrecta. No es alfabética.";
        String result = instance.IntroducirCadena("cinco55");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCaso3_3() {
        String expResult = "Cadena correcta. La aplicación permite el ingreso.";
        String result = instance.IntroducirCadena("septimo");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCaso3_4() {
        String expResult = "Cadena incorrecta. La longuitud de la cadena es > 10";
        String result = instance.IntroducirCadena("murcielagos");
        assertEquals(expResult, result);
    }
}
