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

    public void BubbleSort() {

    }

    public int[] sort(int[] A) {

        int key;
        int[] tempA = new int[A.length];
        System.arraycopy(A, 0, tempA, 0, A.length);

        for (int i = 0; i < tempA.length; i++) {
            for (int j = tempA.length - 1; j > i; j--) {
                if (tempA[j] < tempA[j - 1]) {
                    key = tempA[j];
                    tempA[j] = tempA[j - 1];
                    tempA[j - 1] = key;
                }
            }
        }

        return tempA;
    }
}
