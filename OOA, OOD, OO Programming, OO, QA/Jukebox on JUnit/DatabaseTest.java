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
 * @author Shivani
 */
public class DatabaseTest {
   private java.util.List songList;
   private Song testSong1,testSong2;
   private Database testDB;
   
    public DatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        songList =  new java.util.ArrayList();
        
        testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
        testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
        
        songList.add(testSong1);
        songList.add(testSong2);
        
        testDB = new Database(songList);
    }
    
    @After
    public void tearDown() {
        songList = null;
        testDB = null;
    }


    // The methods must be annotated with annotation @Test. For example:
     @Test
     public void testSongList() {
     
       assertEquals("SongList if empty should have 0 elements",false,songList.isEmpty());
     }

    // TODO add test methods here.
    @Test
    public void testNotEmpty() {
      assertEquals("SongList not empty should have more than 0 elements",true,songList.isEmpty());
    }
}