/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Javier
 */

@RunWith(value=Parameterized.class)
public class Ejercicio1PorParametros {
    private String cadena;
    private String resultadoEsperado;
    
    public Ejercicio1PorParametros(String cadena, String resultadoEsperado) {
        this.cadena = cadena;
        this.resultadoEsperado = resultadoEsperado;
    }
    
    @Parameters
    public static Iterable<Object> getData() {
        List<Object> obj = new ArrayList<>();
        
        // Casos de Prueba por Equivalencias
        // Caso 3.1
        obj.add (new Object[] {"cinco","Cadena incorrecta. La longuitud de la cadena es < 6"});
        // Caso 3.2:
        obj.add (new Object[] {"cinco00", "Cadena incorrecta. No es alfabética."});
        // Implementar el resto de casos de prueba de equivalencias 
        
        return obj;
    }
    
    @Test
    public void testPorParametros() {
        System.out.println("Test Parametro");
        Ejercicio1 ejercicio1 = new Ejercicio1();
        
        String resultadoObtenido = ejercicio1.IntroducirCadena(cadena);
        String resultadoEsperado = this.resultadoEsperado;
        
        assertEquals(resultadoEsperado, resultadoObtenido);
        
    }
    
}
