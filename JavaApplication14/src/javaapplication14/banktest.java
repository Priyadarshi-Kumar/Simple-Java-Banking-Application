/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bank.Bank;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class banktest {
    private Bank b;
    
    public banktest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         this.b = new Bank();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
     @Test
     public void balancetest() {
         assertEquals(100,b.balance=100);
         assertEquals(0,b.balance=0);
         assertEquals(200,b.balance+=200);
         assertEquals(300,b.balance+=100);
         assertEquals(200,b.balance-=100);
     }
     @Test
     public void deposittest(){
         assertEquals(100,b.balance=100);
         assertEquals(200,b.balance+=100);
         
     }
     @Test
     public void withdrawtest(){
         assertEquals(100,b.balance=100);
         assertEquals(0,b.balance-=100);
     }
}
