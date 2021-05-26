/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author javier Bustamante Toledo
 */

@RunWith (value = Suite.class)
@Suite.SuiteClasses ( {
        Ejercicio1ValoresBordeIT.class,
        Ejercicio1PruebasPorEquivalenciasIT.class
        
    }
)
public class JUnitTestSuite {
    
    

    public JUnitTestSuite() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
