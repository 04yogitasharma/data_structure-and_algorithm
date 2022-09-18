package LinkedList;

public class searchElementITERATIVE {
    public static void main(String[] args) {
        Node head=new Node(40);
        Node temp1=new Node(30);
        Node temp2=new Node(20);
        Node temp3=new Node(10);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        printLinkedList(head);
        System.out.println();
        System.out.println(search(head,20));
    }
    public static void printLinkedList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static int search(Node head,int x){
          int pos=1;
          Node curr=head;
          while(curr!=null){
            if(curr.data==x){
                System.out.println(pos);
                return 1;
            }
            else{
                pos++;
                curr=curr.next;
            }
          }
          return -1;
    }
}
