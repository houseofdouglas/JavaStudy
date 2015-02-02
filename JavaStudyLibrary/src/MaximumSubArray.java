
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
public class MaximumSubArray {
    private static int[] a;
    
    MaximumSubArray(int[] arr){
        if(arr.length > 0){
            a = new int[arr.length];
            System.arraycopy(arr, 0, a, 0, a.length - 1);   
        }else{
            a = new int[0];
        }

    }
    
    public int[] getMaxSubArray(){
        
        int[] maxArrayMap = new int[2];
        
        if(a.length==0){
            return a;
        }else{
            maxArrayMap = findMaxSubArray(0,a.length-1);
            return Arrays.copyOfRange(a, maxArrayMap[0], ((a.length-1) - maxArrayMap[1]));
        }
    }
    private int[] findMaxSubArray(int low, int high){
        int[] result = {0,0,0}; 
        int[] left, right, cross = new int[3];
        
        int mid = 0;
        
        if(high==low){
            result[0] = low; result[1] = high; result[2] = a[low];
            return result;
        }else{
            mid = (low + high)/2;
            left = findMaxSubArray(low, mid);
            right = findMaxSubArray(mid+1, high);
            cross = crossSubArray(low, mid, high);
           
            if((left[2] >= right[2])  && (left[2]>=cross[2])){
                return left;
            }else{
                if((right[2] >= left[2]) && (right[2]>=cross[2])){
                    return right;
                }else{
                    return cross;
                }
            }
        }
    }
    
    private int[] crossSubArray(int low, int mid, int high){
        int[] result = new int[3];
        
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = mid; i >= low; i--){
            sum += a[i];
            if(sum > leftSum){
                leftSum = sum;
                result[0] = i;
            }
        }
        
        sum = 0;
        for(int i = mid+1; i <= high; i++){
            sum += a[i];
            if(sum > rightSum){
                rightSum = sum;
                result[1] = i;
            }
        }
        
        result[2] = leftSum + rightSum;
        
        return result;
    }
}
