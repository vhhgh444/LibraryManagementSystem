import java.util.ArrayList;
import java.util.*;

public class CWH_92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer>l2=new LinkedList<>();

        l2.add(15);
        l2.add(16);
        l2.add(14);


        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(4);
        l1.add(5);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(0,l2);
        System.out.println(l1.contains(159));
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
            System.out.println(",");
        }

    }
}
