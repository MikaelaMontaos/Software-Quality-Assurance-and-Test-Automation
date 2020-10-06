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

/*
 *
 * @author Shivani
 */
public class SongTest {
    private Song testSong1, testSong2;
    public SongTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
        testSong2 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
    }
    
    @After
    public void tearDown() {
        testSong1 = null;
        testSong2 = null;
    }

    // The methods must be annotated with annotation @Test. For example:
     @Test
     public void testIsLong1() {
       assertEquals("Song is long if length is more than 50",true,testSong1.isLong());
     }
     @Test
     public void testIsLong2() {
       assertEquals("Song is long if length is more than 50",true,testSong2.isLong());
     }

     // TODO add test methods here.
     @Test
     public void testIsShort1() {
       assertEquals("Song is short if length is less than 50",false,testSong1.isLong());
     }
}