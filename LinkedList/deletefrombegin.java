package LinkedList;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class deletefrombegin {
    public static void main(String[] args) {
        Node head=null;
         head=insertAtBegin(head,30);
         head=insertAtBegin(head,20);
         head=insertAtBegin(head,10);
         head=insertAtBegin(head,5);
        printLinkedList(head);
        head=deletebegin(head);
        System.out.println();
        printLinkedList(head);

    }
    public static Node insertAtBegin(Node head,int x){
          Node temp=new Node(x);
          temp.next=head;
          return temp;
    }
    public static void printLinkedList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static Node deletebegin(Node head){
        if(head==null){
            return null;
        }
        return head.next;
    }
}
