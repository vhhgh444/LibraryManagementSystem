package com.company;

public class problem6 {
    public static void main(String[] args) {


        // Q1:- Sum of 5 floats
       /* float[] arr={5.05f,6.12f,9.8f,8.5f,4.5f};
        float sum=0;
        for(float element: arr){
            sum=sum+element;
        }
        System.out.println("The value of sum is :- "+sum);
        */

        // Q2:- Check the given integer is present or not
        /*int [] marks={90,89,88,85,87};
        int num=89;
        boolean isInArray=false;
        for(int element:marks){
            if(num==element){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
         */

        // Q3:-
        /*
        float [] marks_physics={87,89,85.5f,65,90,92.6f};
        float sum=0;
        for(float element:marks_physics){
            System.out.println(element);
            sum+=element;
        }
        float average=sum/6;
        System.out.println("The average marks in physics is:- "+average);
         */

        // Q4:- 2X3 matrices creation and add them

        /*
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{3, 2, 1}, {7, 8, 9}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format("Setting value for i=%d and J=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    //  System.out.printf("Setting value for i=%d and J=%d\n",i,j);
                    System.out.print(result[i][j] + " ");
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println("");
            }
         */

        // Q5:- Reverse of an array
        /*
        int [] arr={8,7,9,6,5};
        int l=arr.length;
        int n= Math.floorDiv(arr.length,2);
        for (int i=0;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;

        }
        for(int element:arr){
            System.out.print(element+" ");
        }
         */

        // q6:- Maximum in array
        /*
        int [] arr={9,6,44,12,59};
        int max=0;
        for(int element:arr){
            if(element>max){
                max=element;
            }
        }
        System.out.println(max);
         */

        // Q7:- Minimum value from an array
        int arr[]={4,5,6,3,2,1};
        int min=1;
        for(int element:arr){
            if(element<min){
                min=element;
            }
            System.out.println(min);
        }
    }
}

