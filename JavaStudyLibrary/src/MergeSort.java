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

    public MergeSort() {

    }

    public int[] sort(int[] A) {
        _array = new int[A.length];
        return mergeSort(A);
        //return _array;
    }

    private int[] mergeSort(int[] a) {

        if (a.length == 1) {
            return a;
        }
        
        int[] rA = array.copyOfRange(a, 0, a.length / 2);
        int[] lA = array.copyOfRange(a, (a.length / 2), a.length);
        
        rA = mergeSort(rA);
        lA = mergeSort(lA);
        
        return merge(rA, lA);

    }

    private int[] merge(int[] r, int[] l) {

        int[] tempA = new int[r.length + l.length];

        int[] tR = new int[r.length + 1];
        int[] tL = new int[l.length + 1];
        
        tR[r.length] = -1;
        tL[l.length] = -1;

        System.arraycopy(r, 0, tR, 0, r.length);
        System.arraycopy(l, 0, tL, 0, l.length);



        int rC = 0, lC = 0;

        for (int i = 0; i < tempA.length; i++) {
            if ((tL[lC] < 0) || ((tR[rC] >= 0) && (tR[rC] < tL[lC]))) {
                tempA[i] = tR[rC];
                rC++;
            } else {
                if (tL[lC] >= 0) {
                    tempA[i] = tL[lC];
                    lC++;
                }
            }
        }

        return tempA;
    }
}
