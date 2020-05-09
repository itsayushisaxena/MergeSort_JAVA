/*
   Ayushi Saxena
   181520015
 */
package mergesort;

import java.util.Arrays;

public class MergeSort{
    public void mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (high + low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high){
        int[] crr = new int[high + 1];

    }
}