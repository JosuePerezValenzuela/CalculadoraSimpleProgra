
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTests
{
    private Calculator calculator;
    public CalculatorTests()
    {
    }
    @BeforeEach
    public void setUp()
    {
        calculator = new Calculator(-100, 100);
    }
    @Test
       public void Add() {
        int result = calculator.add(2,2);
        assertEquals(4,result);
       }
    @Test
       public void AddWithDifferentArguments() {
         int result = calculator.add(2,5);
         assertEquals(7,result);
       }
    @Test
        public void Substract() {
         int result = calculator.substract(5,3);
         assertEquals(2,result);
       }
    @Test
        public void SubstractReturningNegative() {
         int result = calculator.substract(3,5);
         assertEquals(-2,result);
       }
    @Test
        public void SubstractSettingLimitVaulues() {
         Calculator calculator = new Calculator (-100, 100);
         int result = calculator.substract(5,10);
         assertEquals(-5,result);
        }
    @Test
       public void SubstractExcedingLowerLimit() { 
        try{
            int result = calculator.substract(10,150);
            fail("Exception is not being thrown when " +
                "exceeding lower limit");
        }catch (Exception e) {
            // ok, the SUT works as expected
        }
    }
    @Test 
        public void SetAndGetUpperLimit() {
         Calculator calculator = new Calculator (-100, 100);
         assertEquals (100, calculator.getUpperLimit());
         assertEquals (-100, calculator.getLowerLimit());
    }
    @Test
    public void SubstractExcedingUpperLimit() { 
        try{
            int result = calculator.add(150,10);
            fail("Exception is not being thrown when"+
                "exceeding lower limit");
        }catch (Exception e) {
            // ok, the SUT works as expected
        }
    }   
    @Test
    public void ArgumentsExceedLimits () {
        try{
             calculator.add(calculator.getUpperLimit() + 1, calculator.getLowerLimit() - 1);
             fail("Should fail" + " arguments exced limits");
        }    
        catch (Exception e){
             // ok, this works
        }
    }
    @Test
    public void ArgumentsExceedLimitsInverse () {
        try{
           calculator.add(calculator.getLowerLimit() - 1, calculator.getLowerLimit() + 1);
           fail("Should fail" + "arguments exceed limits");
        } 
        catch (Exception e){
           // ok, this works
        } 
    }
    @Test
    public void ArgumentsExceedLimitsOnSubstract () {
       try{
          calculator.substract(calculator.getUpperLimit() + 1, calculator.getLowerLimit() - 1);
          fail("Should fail" + "arguments exceed limits");
       } 
       catch (Exception e){
         // ok, this works
       } 
    }
    @AfterEach
    public void tearDown(){
    {
    }
    }
}
