package com.company;


public class CWH_29_Array_Practice {
    public static void main(String[] args) {

        //problem 1:-
//        float [] marks={45.7f,67.8f,63.4f,99.2f,100f};
//        float sum=0;
//        for (float element:marks){
//            sum=sum+element;
//        }
//        System.out.println("The value of sum is:- " +sum);

        //Problem 2:-

//        float [] marks={45.7f,67.8f,63.4f,99.2f,100f};
//        float num=45.7f;
//        boolean isInArray=false;
//        for (float element:marks){
//          if(num==element){
//              isInArray=true;
//              break;
//          }
//        }
//        if(isInArray){
//            System.out.println("The value is present in the array");
//
//        }
//        else{
//            System.out.println("The value is not present in the array");
//        }
        //Problem 3:-
        /*float [] marks={45.7f,67.8f,63.4f,99.2f,100f};
        float sum=0;
        for (float element:marks){
            sum=sum+element;
        }
        System.out.println("The average value of marks is:- " +sum/marks.length);

        //Problem 4:-

        int [] [] mat1={{1,2,3},
                         {4,5,6}};

        int [][] mat2={{2,6,13},
                {3,7,1}};

        int [][] result={{0,0,0},
                        {0,0,0}};

        for(int i=0;i< mat1.length;i++){//row number of times
            for (int j=0;j<mat1[i].length;j++){//cloumn number of times
                System.out.println(result[i][j] + " ");
                result[i][j]=mat1[i][j]+mat2[i][j];

            }
            System.out.println("");
        }


        //Problem 5:-

       int [] arr={1,2,3,4,5,6};
       int l=arr.length;
        int n=Math.floorDiv(arr.length,2);
        int temp;
       for (int i=0;i<n;i++){
           //Swap a[i] and a[l-1-i]
           temp=arr[i];
           arr[i]=arr[l-1-i];
           arr[l-i-1]=temp;

       }
       for (int element:arr){
           System.out.println(element+ " ");
       }

        //Problem 6:-

        int [] arr={1,21,31,455,96,999,87};
        int max=0;
        for(int element:arr){
            if (element>max){
                max=element;
            }
        }
        System.out.println("The maximum value of the element in this array is:- "+ max);

         */

        //Problem 8:-

        boolean IsSorted=true;
        int [] arr={1,2,3,4,5,6,7,8};
        for(int i=0;i< arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                IsSorted=false;
                break;
            }
        }
        if (IsSorted){
            System.out.println("The Array is Sorted");

        }

        else{
            System.out.println("The Array is not sorted");
        }



    }

}
