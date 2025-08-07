package com.company;

public class Demo_DSA {
    public static void main(String[] args) {

        int [] nums=new int[1000];

        int target=500;
       int result1=linearSearch1(nums,target);
        int result2 =binarySearch1(nums,target);

        if (result1 !=-1){
        System.out.println("The Index value is:- "+ result1);
    }
        else {
            System.out.println("The Element is not found in the array");
        }
    }

    // Linear Search using Java:-

    public static int linearSearch1(int[] nums, int target) {

        int steps=0;

        for (int i=0;i<nums.length;i++){
            steps++;
            if(nums[i]==target){
                System.out.println("Steps taken by linear search is:- "+steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear search is:- "+steps);
        return -1;
    }

    // Binary search using java
    public static int binarySearch1(int[] nums, int target) {
        int steps=0;
        int left=0;
        int right=nums.length-1;

        while (left<=right){
            steps++;
            int mid=(left+right)/2;
            if (nums[mid]==target){
                System.out.println("Steps taken by binary search search is:- "+steps);
                return mid;
            }
            else if (nums[mid]<target) {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        System.out.println("Steps taken by binary search is:- "+steps);
        return -1;
    }
}
