/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandi
 */
public class BubbleSort {
    public void BubbleSort(){
        
    }
    
    public int[] sort(int[] A){
        
        int key;
        
        for(int i = A.length-1; i < 0; i--){
            key = A[i];
            if(A[i-1] > A[i]){
                A[i] = A[i-1];
                A[i-1] = key;
            }
        }
        
        return A;
    }
}
