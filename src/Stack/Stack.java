package Stack;

public class Stack {

    private int[] arr=new int[5];
    int top=-1;
    int size;



    public Stack(){
        size= arr.length;
        top=-1;

    }
    public void push(int data){
       if (top<size){
        arr[++top]=data;
    } else {
           System.out.println("Stack Overflow");}
    }

    public int pop(){
        if (top>-1){
        return arr[top--];
        }
        else{
            System.out.println("Stack Underflow");
        }
        return 0;
    }

    public int peak(){
        return arr[top];

    }
    public void printStack(){
        for(int n:arr){
            System.out.println(n+" ");
        }
        System.out.println();
    }
}
