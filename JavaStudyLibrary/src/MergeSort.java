/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
/**
 *
 * @author Brandi
 */
public class MergeSort {
    
    private static Arrays array;
    private static int[] _array;
    public MergeSort(){
        
    }
    
    public int[] sort(int[] A){
        _array = new int[A.length];
        return mergeSort(A, 0, A.length/2, A.length-1);
        //return _array;
    }
    
    private int[] mergeSort(int[] a, int r, int m, int l){
        
        if(r == l){
            return array.copyOfRange(a, r, m);
        }else{
            int[] rA = mergeSort(a, r, (m-r)/2, m);
            int[] lA = mergeSort(a, (m+1), (l-(m+1)), l);
            merge(rA, lA);
            return array.copyOfRange(a, r, l);
        }
    }
    
    private void merge(int[] r, int[] l){
       
        int[] tempA = new int[r.length + l.length];
        
        int[] tR = new int[r.length+1];
        int[] tL = new int[l.length+1];
        
        System.arraycopy(r, 0, tR, 0, r.length-1);
        System.arraycopy(l, 0, tL, 0, l.length-1);
        
        tR[r.length+1] = -1;
        tL[l.length+1] = -1;
        
        int rC = 0, lC = 0;
        
        for(int i = 0; i < tempA.length; i++){
            if((tR[rC]>0) && (tR[rC]<tL[lC])){
                tempA[i] = tR[rC];
                rC =+ 1;
            }else{
                if(tL[lC]>0){
                    tempA[i] = tL[lC];
                    rC =+ 1;
                }
            }
        }
        
        return tempA;
    }
}
