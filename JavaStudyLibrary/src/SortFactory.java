/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandi
 */
public class SortFactory {

    public static Sortable getSorter(int[] a) {

        if (a.length <= 10) {
            return new BubbleSort();
        } else if (a.length > 10 && a.length <= 1000) {
            return new InsertSort();
        } else if (a.length > 1000) {
            return new MergeSort();
        }
        return null;
        
    }
}
