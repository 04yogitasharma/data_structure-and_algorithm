package LinkedList;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class insertAtEnd {
    public static void main(String[] args) {
        Node head=null;
        head=insertAtBegin(head,30);
        head=insertAtBegin(head,20);
        head=insertAtBegin(head,10);
        head=insertAtBegin(head,5);
        head=insertEnd(head,40);
        head=insertEnd(head,30);
        head=insertEnd(head,20);
        head=insertEnd(head,10);
        head=insertEnd(head,5);
        printList(head);
    }
    public static Node insertAtBegin(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

     static Node insertEnd(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            return temp;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
}

