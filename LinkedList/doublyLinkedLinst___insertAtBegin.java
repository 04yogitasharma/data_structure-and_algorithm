package LinkedList;

class Node{
    int data;
    Node next;
    Node previous;
    Node(int x){
        data=x;
        previous=null;
        next=null;
    }
}

public class doublyLinkedLinst___insertAtBegin {
    public static void main(String[] args) {
        Node head=new Node(40);
        Node temp1=new Node(30);
        Node temp2=new Node(20);
        head.next=temp1;
        temp1.previous=head;
        temp1.next=temp2;
        temp2.previous=temp1;
        head=insertAtBegin(head,5);
        printLinkedList(head);
    }

    public static void printLinkedList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static Node insertAtBegin(Node head,int x){
        Node temp=new Node(5);
        temp.next=head;
        if(head!=null){
            head.previous=temp;
        }
        return temp;
    }
}
