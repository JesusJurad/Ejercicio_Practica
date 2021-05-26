/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javie
 */
public class Ejercicio1ValoresBordeIT {
    
    public Ejercicio1ValoresBordeIT() {
    }

    @Test
    public void testCaso4_1() {
        System.out.println("Caso 4.1: Datos de entrada: cadena de 6 caracteres, sólo caracteres alfabéticos. Resultado\n" +
"esperado (Salida): La aplicación permite el ingreso del dato.");
        Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena correcta. La aplicación permite el ingreso.";
        String result = instance.IntroducirCadena("cincos");
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCaso4_2() {
        System.out.println("Caso 4.2: Datos de entrada: cadena de 10 caracteres, sólo caracteres alfabéticos. Resultado\n" +
"esperado (Salida): La aplicación permite el ingreso del dato.");
        Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena correcta. La aplicación permite el ingreso.";
        String result = instance.IntroducirCadena("cincocinco");
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCaso4_3() {
        System.out.println("Caso 4.3: Datos de entrada: cadena de 6 caracteres, con caracteres no alfabéticos. Resultado\n" +
"esperado (Salida): La aplicación no permite el ingreso del dato y muestra un mensaje de error.");
        Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena incorrecta. No es alfabética.";
        String result = instance.IntroducirCadena("cinco0");
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCaso4_4() {
        System.out.println("Caso 4.3: Datos de entrada: cadena de 10 caracteres, con caracteres no alfabéticos.\n" +
"Resultado esperado (Salida): La aplicación no permite el ingreso del dato y muestra un\n" +
"mensaje de error.");
        Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena incorrecta. No es alfabética.";
        String result = instance.IntroducirCadena("cincocinc0");
        assertEquals(expResult, result);
    }
}
