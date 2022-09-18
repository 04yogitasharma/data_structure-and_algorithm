package LinkedList;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class InsertAtBegining {
    public static void main(String[] args) {
        Node head=null;
        head=insertAtBegin(head,30);
        head=insertAtBegin(head,20);
        head=insertAtBegin(head,10);
        head=insertAtBegin(head,5);
        printList(head);
    }
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static Node insertAtBegin(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    
}
