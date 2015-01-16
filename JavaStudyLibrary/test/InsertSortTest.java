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
 * @author Brandi
 */
public class InsertSortTest {
    
    private int[] a = {2,3,4,5,6,1};
    private int[] b = {1,2,3,4,5,6};
    
    public InsertSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {

    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void insertSort(){

        InsertSort is = new InsertSort();
        assertArrayEquals(b, is.sort(a));
        
    }
    
    @Test
    public void bubbleSort(){
        BubbleSort bs = new BubbleSort();
        assertArrayEquals(b, bs.sort(a));
    }
    
    @Test
    public void mergeSort(){
        MergeSort ms = new MergeSort();
        assertArrayEquals(b, ms.sort(a));
    }
}
