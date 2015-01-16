/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Random;
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
    
    private int[] a = new int[100];
    private int[] b = new int[100];
    
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
        //prep a
        Random rand = new Random();
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(99);
        }
        //prep b
        System.arraycopy(a, 0, b, 0, 99);
        Arrays.sort(b);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void insertSort(){

        InsertSort is = new InsertSort();
        int[] c = is.sort(a);
        assertArrayEquals(b, c);
        
    }
    
    @Test
    public void bubbleSort(){
        BubbleSort bs = new BubbleSort();
        int[] c = bs.sort(a);
        assertArrayEquals(b, bs.sort(a));
    }
    
    @Test
    public void mergeSort(){
        
        int[] x = {1,0};
        int[] y = {1};
        int[] z = new int[1];
        
        System.arraycopy(x, 0, z, 0, 1);
        
        assertArrayEquals(y,z);
        
        MergeSort ms = new MergeSort();
        int[] c = ms.sort(a);
        assertArrayEquals(b, ms.sort(a));
    }
}
