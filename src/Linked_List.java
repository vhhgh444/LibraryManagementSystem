package com.company;
import java.util.LinkedList;
public class Linked_List {
    public static  void main(String[] args) {
        LinkedList nums=new LinkedList();
        nums.add(5);
        nums.add(6);

        nums.add(9);
        nums.addFirst(7);
        nums.remove(3);


        System.out.println(nums);
        System.out.println(nums.get(2));
    }
}
