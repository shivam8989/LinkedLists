package LinkedList;

public class AddFirst {
    public class Node{
        int data;
        Node next;

        public Node (int data){
            this.data  = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;


    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail= newNode;
            return;
        }
        //Step 2 = newNode next = head
        newNode.next = head; // link

        // Step 3 = head = new Node
        head = newNode;
    }
    public void print(){
        AddFirst.Node temp = head;
        if(temp == null){
            System.out.println("Linkedlist is empty");
            return;
        }
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String args[]){
        AddFirst ll = new AddFirst();
        ll.print();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

    }
}
