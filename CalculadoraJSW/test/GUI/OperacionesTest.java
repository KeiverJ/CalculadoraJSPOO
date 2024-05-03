/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GUI;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author keiver
 */
public class OperacionesTest {

    public OperacionesTest() {
    }

    @Test
    public void testGetNum1() {
        System.out.println("getNum1");
        Operaciones instance = new Operaciones(25.0, 13.0);
        double expResult = 25.0;
        double result = instance.getNum1();
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testSetNum1() {
        System.out.println("setNum1");
        double num1 = 25.0;
        Operaciones instance = new Operaciones();
        instance.setNum1(num1);
        assertEquals(num1, instance.getNum1(), 0);
    }

    @Test
    public void testGetNum2() {
        System.out.println("getNum2");
        Operaciones instance = new Operaciones(25.0, 13.0); 
        double expResult = 13.0;
        double result = instance.getNum2();
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testSetNum2() {
        System.out.println("setNum2");
        double num2 = 13.0;
        Operaciones instance = new Operaciones();
        instance.setNum2(num2);
        assertEquals(num2, instance.getNum2(), 0);
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        double num1 = 50.0;
        double num2 = 10.0;
        Operaciones instance = new Operaciones(num1, num2);
        double expResult = 60.0;
        double result = instance.sumar(num1, num2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        double num1 = 20.0;
        double num2 = 15.0;
        Operaciones instance = new Operaciones(num1, num2);
        double expResult = 5.0;
        double result = instance.restar(num1, num2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double num1 = 10.0;
        double num2 = 3.0;
        Operaciones instance = new Operaciones(num1, num2);
        double expResult = 30.0;
        double result = instance.multiplicar(num1, num2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDividir() {
        System.out.println("dividir");
        double num1 = 52.0;
        double num2 = 2.0;
        Operaciones instance = new Operaciones(num1, num2); 
        double expResult = 26.0;
        double result = instance.dividir(num1, num2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularPotencia() {
        System.out.println("calcularPotencia");
        double base = 7.0;
        double exponente = 3.0;
        Operaciones instance = new Operaciones();
        double expResult = 343.0;
        double result = instance.calcularPotencia(base, exponente);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularPorcentaje() {
        System.out.println("calcularPorcentaje");
        double num = 100.0;
        double porcentaje = 50.0;
        Operaciones instance = new Operaciones(); 
        double expResult = 50.0;
        double result = instance.calcularPorcentaje(num, porcentaje);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Operaciones instance = new Operaciones(25.0, 13.0); 
        String expResult = "Operaciones{num1=25.0, num2=13.0}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
