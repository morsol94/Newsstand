/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author Morten
 */
public class NewspaperTest
{
    
    Newspaper paper;
    Newspaper newsP;
    
    public NewspaperTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
       paper = new Newspaper("Andeby Times", "Donald Duck", 23, "BreakingNews");
       paper.setPrice(290);
       
       newsP = new Newspaper("Gausdal Times","Brødrene dahl", 979000, "News of the News");
       
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getIssueNumber method, of class Newspaper.
     */
    @Test
    public void testGetIssueNumber()
    {
        int expResult = 23;
        int result = paper.getIssueNumber();
        assertEquals(expResult, result);
        
        int exptResult = 979000;
        int res = newsP.getIssueNumber();
        assertEquals(exptResult,res);
        
        
    }

    /**
     * Test of getTitle method, of class Newspaper.
     */
    @Test
    public void testGetTitle()
    {
        String expResult = "Andeby Times";
        String result = paper.getTitle();
        assertEquals(expResult, result);
        
        String exptResult = "Gausdal Times";
        String res = newsP.getTitle();
        assertEquals(exptResult, res);
 
    }

    /**
     * Test of getPublisher method, of class Newspaper.
     */
    @Test
    public void testGetPublisher()
    {
        String expResult = "Donald Duck";
        String result = paper.getPublisher();
        assertEquals(expResult, result);

    }

    /**
     * Test of getGenre method, of class Newspaper.
     */
    @Test
    public void testGetGenre()
    {
        String expResult = "BreakingNews";
        String result = paper.getGenre();
        assertEquals(expResult, result);

        String exptResult = "News of the News";
        String res = newsP.getGenre();
        assertEquals(exptResult, res);
    }

    /**
     * Test of setPrice method, of class Newspaper.
     * One  paper with already changed price and one with default.
     */
    @Test
    public void testSetPrice()
    {
        double price = 300;
 
        paper.setPrice(price);
        double result = paper.getPrice();
        assertEquals(price, result, 0.01);
        
        double secondPrice = 500;
        newsP.setPrice(secondPrice);
        double secondResult = newsP.getPrice();
        assertEquals(secondPrice, secondResult, 0.01);
    }

    /**
     * Test of getPrice method, of class Newspaper.
     * One paper with price set and one paper wit default price.
     */
    @Test
    public void testGetPrice()
    {
        double expResult = 290;
        double result = paper.getPrice();
        assertEquals(expResult, result, 0.01);
        
        double secondExpResult = 19.99;
        double secondResult = newsP.getPrice();
        assertEquals(secondExpResult, secondResult, 0.01);
        

    }
    
}
