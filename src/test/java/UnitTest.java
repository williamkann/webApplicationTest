/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.*;
import webApp.beans.Calculator;

public class UnitTest extends TestCase{
    Calculator calc = new Calculator();
    
    public void testAddition() throws Exception {
        assertEquals(2.0,calc.addition(1, 1));
    }
    public void testSubstraction() throws Exception {
        assertEquals(2.0,calc.substraction(3, 1));
    }
    public void testDivision() throws Exception {
        assertEquals(2.0,calc.division(4, 2));
    }
    public void testMultiplication() throws Exception {
        assertEquals(2.0,calc.multiplication(2, 1));
    }
}
