
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandi
 */
public class InsertSort {

    
    public void InsertSort() {
        
    }
    
    public int[] sort(int[] A){
                
        int key, j;
        
        for (int i = 1; i < A.length; i++) {
            key = A[i];
            j = i - 1;
            //While your current pointer is less than
            //the previous and the previous position is
            //greater than zero, move the previous value
            //to the next value and then replace the
            //previous with the key
            while (j >= 0 && A[j] > key) {
                A[j+1] = A[j];
                A[j] = key;
                j--;
            }
        }
        
        return A;
    }
}
