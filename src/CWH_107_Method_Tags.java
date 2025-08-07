package com.company;

/**
 * This is the Method representation class
 */
public class CWH_107_Method_Tags {
    /**
     *
     * @param args These are arguments supply to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am amin method");
    }

    /**
     * hello this is a method and this is the most beautiful method of this class
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + Operation
     */
    public int add(int i,int j) throws Exception{
        if (i==0){
            throw new Exception();
        }
        int c;
        c=i+j;
        return c;
    }
}
