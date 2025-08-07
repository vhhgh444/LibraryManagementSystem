class Node{
    int data;
    Node next;


    public Node(int data){
        this.data=data;
        next=null;

    }

}


public class LinkedList{

    Node head=null;
    public void add(int data){
        Node newNode=new Node(data);
        //newNode.data=data;

        Node current=head;

        if (head==null){
            head=newNode;
        }
        else {

            while (current.next!=null){
                current=current.next;
            }

            current.next=newNode;

        }

    }

    public void printValue(){
        Node current=head;
        while (current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void remove(int data){

        Node current=head;
        while (current.next !=null && current.next.data!=data){
            current=current.next;
        }
        if (current.next !=null){
            current.next=current.next.next;
        }


    }
    
}
