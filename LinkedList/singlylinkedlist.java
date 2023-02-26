

public class singlylinkedlist{
   
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;

    public void Add(int data){
        Node newNode=new Node(data);
        if(head!=null){
            tail.next=newNode;
            tail=newNode;
        }
        else{
            head=newNode;
            tail=newNode;
        }
    }
    public void Display(){
        Node current=head;
        if(head==null) System.out.println("Empty list");
        else{
            while(current!=null){
                System.out.print(current.data+"->");
            }
            System.out.println("End");
        }
    }
    public static void main(String[] args) {
        singlylinkedlist ll=new singlylinkedlist();
        ll.Add(0);
        ll.Add(1);
        ll.Display();
    }
}