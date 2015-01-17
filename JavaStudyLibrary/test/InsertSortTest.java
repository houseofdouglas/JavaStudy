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
    
    private final int RANDOM_SET = 99; 
    
    private final int[] a = new int[RANDOM_SET]; //{3,1,2,0,1,6,5,4};
    private final int[] b = new int[RANDOM_SET]; //{0,1,1,2,3,4,5,6};
    
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
            a[i] = rand.nextInt(RANDOM_SET);
        }
        //prep b
        System.arraycopy(a, 0, b, 0, RANDOM_SET);
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
