/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Date;
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

    private final int RANDOM_SET_SMALL = 10;
    private final int RANDOM_SET_MEDIUM = 1000;
    private final int RANDOM_SET_LARGE = 10000;

    private int[] a; //{3,1,2,0,1,6,5,4};
    private int[] b; //{0,1,1,2,3,4,5,6};

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
    public void insertSort() {

        a = new int[RANDOM_SET_MEDIUM];
        b = new int[RANDOM_SET_MEDIUM];
        
        Random rand = new Random();
        
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(RANDOM_SET_MEDIUM);
        }
        //prep b
        System.arraycopy(a, 0, b, 0, RANDOM_SET_MEDIUM);
        Arrays.sort(b);
        
        assertArrayEquals(b, SortFactory.getSorter(a).sort(a));
    }

    @Test
    public void bubbleSort() {

        a = new int[RANDOM_SET_SMALL];
        b = new int[RANDOM_SET_SMALL];
        
        Random rand = new Random();
        
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(RANDOM_SET_SMALL);
        }
        //prep b
        System.arraycopy(a, 0, b, 0, RANDOM_SET_SMALL);
        Arrays.sort(b);
        
        assertArrayEquals(b, SortFactory.getSorter(a).sort(a));
    }

    @Test
    public void mergeSort() {
        
        a = new int[RANDOM_SET_LARGE];
        b = new int[RANDOM_SET_LARGE];
        
        Random rand = new Random();
        
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(RANDOM_SET_LARGE);
        }
        //prep b
        System.arraycopy(a, 0, b, 0, RANDOM_SET_LARGE);
        Arrays.sort(b);
        
        assertArrayEquals(b, SortFactory.getSorter(a).sort(a));
    }

    @Test
    public void factorySort() {

        int[] x = new int[5];
        int[] y = new int[15];
        int[] z = new int[1005];

        Sortable s = SortFactory.getSorter(x);

        assertEquals(new BubbleSort().getClass(), s.getClass());

        s = SortFactory.getSorter(y);

        assertEquals(new InsertSort().getClass(), s.getClass());

        s = SortFactory.getSorter(z);

        assertEquals(new MergeSort().getClass(), s.getClass());

    }
}
