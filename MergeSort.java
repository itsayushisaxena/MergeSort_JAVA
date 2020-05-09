/*
   Ayushi Saxena
   181520015
 */

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
        int i = low, j = mid+1, k = 0;
        while (i <= mid && j <= high) {
            if(arr[i] <= arr[j]) {
                crr[k] = arr[i];
                k++;
                i++;
            }
            else{
                crr[k] = arr[j];
                k++;
                j++;
            }
        }
        if(i > mid){
            while(j <= high){
                crr[k] = arr[j];
                k++;
                j++;
            }
        }
        else{
            while(i <= mid){
                crr[k] = arr[i];
                k++;
                i++;
            }
        }
        int p = 0;
        for (int l = low; l <= high; l++){
            arr[l] = crr[p];
            p++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {30,65,20,0,-2,76};
        System.out.println("Unsorted Array-->" + Arrays.toString(arr));
        MergeSort obj = new MergeSort();
        obj.mergeSort(arr, 0, arr.length-1);
        System.out.println("Sorted Array-->" + Arrays.toString(arr));
    }
}