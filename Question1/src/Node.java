



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
        list.addEnd("bat");
        list.addEnd("hat");
        list.addEnd("cat");
        list.addBegining("monkey");
        list.display();

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(5)+"\n");
        list.addEnd(null);
        
        list.set(2, "Tardis");
        list.set(3, "potato");
        list.set(4, "tomato");
        list.set(5, "tennet");
       
        list.display();
    
    
    
    
        

    
       
    }
}