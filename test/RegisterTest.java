/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// test
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
public class RegisterTest
{
    
    public RegisterTest()
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
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of addNewspaper method, of class Register.
     */
    @Test
    public void testAddNewspaper()
    {
        System.out.println("addNewspaper");
        String name = "";
        String publisher = "";
        int issueNumber = 0;
        String genre = "";
        Register instance = new Register();
        instance.addNewspaper(name, publisher, issueNumber, genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeNewspaper method, of class Register.
     */
    @Test
    public void testRemoveNewspaper()
    {
        System.out.println("removeNewspaper");
        String newspaperToBeRemoved = "";
        Register instance = new Register();
        instance.removeNewspaper(newspaperToBeRemoved);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectPrice method, of class Register.
     */
    @Test
    public void testSelectPrice()
    {
        System.out.println("selectPrice");
        String title = "";
        double price = 0.0;
        Register instance = new Register();
        instance.selectPrice(title, price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayCollection method, of class Register.
     */
    @Test
    public void testDisplayCollection()
    {
        System.out.println("displayCollection");
        Register instance = new Register();
        instance.displayCollection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchForNewspaper method, of class Register.
     */
    @Test
    public void testSearchForNewspaper()
    {
        System.out.println("searchForNewspaper");
        String titleSearch = "";
        String publisherSearch = "";
        Register instance = new Register();
        instance.searchForNewspaper(titleSearch, publisherSearch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchAllFromPublisher method, of class Register.
     */
    @Test
    public void testSearchAllFromPublisher()
    {
        System.out.println("searchAllFromPublisher");
        String publisherSearch = "";
        Register instance = new Register();
        instance.searchAllFromPublisher(publisherSearch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
