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

    Node getPre(){
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
        list.addEnd(1);
        list.addEnd(3);
        list.addBegining(7);
        list.addBegining(9);
        list.addBegining(5);
        list.addBegining(4);
        list.addEnd(2);
        list.addEnd(6);
        list.addBegining(8);
        list.addBegining(600);
        list.addEnd(500);
        list.display();
        System.out.println("\n");
        list.removeByValue(500);
        list.removeByValue(600);
        list.display();
        list.search(420);
        list.size();
        
    }
}