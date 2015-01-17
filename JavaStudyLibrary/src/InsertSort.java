
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandi
 */
public class InsertSort implements Sortable{

    
    public void InsertSort() {
        
    }
    
    @Override
    public int[] sort(int[] A){
        
        int[] tempA = new int[A.length];
        
        System.arraycopy(A,0,tempA,0,A.length);
                
        int key, j;
        
        for (int i = 1; i < tempA.length; i++) {
            key = tempA[i];
            j = i - 1;
            //While your current pointer is less than
            //the previous and the previous position is
            //greater than zero, move the previous value
            //to the next value and then replace the
            //previous with the key
            while (j >= 0 && tempA[j] > key) {
                tempA[j+1] = tempA[j];
                tempA[j] = key;
                j--;
            }
        }
        
        return tempA;
    }
}
