/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author akanksha singh
 */
public class Calculator {
    public static int add(int number , int number2){
        return number+number2;
        
    }
    public static int sub(int number1,int number2)
    {
        return number1-number2;
    }
    public static int mul(int number1,int number2)
    {
      return number1*number2;  
    }
    public static double div(double number1,double number2)
    { if(number2==0){
        throw new IllegalArgumentException("division by 0 not possible");
    }
        return number1/number2;
    }
    
    public void CalculatorTest() {
    }

    @Test
    public void CalculatorT() {
        assertEquals("error in add()",3,Calculator.add(1,2));
        assertEquals("error in add()",-3,Calculator.add(-1,-2));
        assertEquals("error in add()",8,Calculator.add(9,0));
    }
    public void calcTestFail(){
        assertEquals("error in add()",0,Calculator.add(1,2));
        
    }
    public void calcTestSubPass(){
        assertEquals("error in sub()",1,Calculator.add(1,2));
        assertEquals("error in sub()",-1,Calculator.add(-1,-2));
        assertEquals("error in sub()",0,Calculator.add(2,1));
        
    }
    public void calcSubFail(){
        assertEquals("error in sub()",0,Calculator.add(2,1));
        
    }
}
