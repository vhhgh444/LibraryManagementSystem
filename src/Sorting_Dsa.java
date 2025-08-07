package com.company;

public class Sorting_Dsa {


    /*public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            // quicksort(arr);
            // quicksort();
        }

     */
    private static void mergesort(int[] arr, int l, int r) {
        if(l<r){
            int mid=(l+r)/2;
            mergesort(arr, l,mid);
            mergesort(arr,mid+1,r);
            
            merge(arr,l,mid,r);
        }

    }
    private static void merge(int[] arr, int l, int mid, int r) {

        int n1=mid-l+1;
        int n2=r-mid;

        int [] lArr=new int[n1];
        int [] rArr=new int[n2];

        for (int x=0;x<n1;x++){
            lArr[x]=arr[l+x];
        }
        for (int x=0;x<n2;x++){
            rArr[x]=arr[mid+1+x];
        }

        int i=0;
        int j=0;
        int k=l;


        while(i<n1 && j<n2){
            if(lArr[i]<=rArr[j]){
                arr[k]=lArr[i];
                i++;
            }
            else{
                arr[k]=rArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=lArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rArr[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {
        // int[] nums = {6, 9, 8, 3, 2, 1};
        // int size = nums.length;
        //int temp;
        //int minIndex = -1;

        int[] arr = {3, 5, 1, 4, 6, 2};
       // quicksort(arr, 0, arr.length - 1);

        System.out.println("Before sorting:- ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergesort(arr, 0, arr.length - 1);




        /*for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){

                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
         */


       /* for (int i=0;i<size;i++){
            for (int j=0;j<size-i-1;j++){
                if (nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }


            System.out.println();
            for (int num:nums){
                System.out.print(num+" ");
            }
        */
       /* for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }

                temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;

                System.out.println();
                for (int num : nums) {
                    System.out.print(num + " ");
                }

            }
        */

        System.out.println();
        System.out.println("After sorting:- ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }



}