/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FLASH2030
 */
public class calculatriceTest {
    public calculatriceTest(){}
   
    @Test
    public void testAdditionner() {
        System.out.println("additionner");
        calculatrice cal = new calculatrice();
        int result=cal.additionner(12,3);
       
        
        assertEquals(15, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
