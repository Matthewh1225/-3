public class Node {

    Object info;
    Node next;
    Node pre;

    public Node(){

    }
    public Node(Object info,Node next){
        this.next=next;
        this.info=info;
    }

    Object getPre(){
        return this.pre;
    }
    Object getInfo(){
        return this.info;
    }
    Node getNext(){
        return this.next;
    }
    void setPre(Node pre){
        this.pre=pre;}

    void setNext(Node next){
        this.next=next;
    }
    void setInfo( Object info){
         this.info=info;
    }

    public static void main(String[] args) throws Exception {
        LList list = new LList();
        // Node head =new Node(1,null);
        // Node node2 =new Node(2, null);
        // Node node3 =new Node(3, null);
        // Node node4 =new Node(4, null);
        // Node node5 =new Node(5, null);
        // head.setNext(node2);
        // node2.setNext(node3);
        // node3.setNext(node4);
        // node4.setNext(node5);
        // l.setHead(head);
        // System.out.println(head.info);
        // System.out.println(head.next.info);
        // System.out.println(head.next.getNext());
        list.addEnd(167);
        list.addEnd(72);
        list.addEnd(673);
        list.AddBegining( 975);
        list.AddBegining( 835);
        list.AddBegining( 0);
        list.display();
        list.GetValue(0);
        list.search(9684);
     
    
        

    
       
    }
}