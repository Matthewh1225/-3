public class Node {

    private Object current;
    private Node next;
    private Node pre;

    public Node(){

    }
    public Node(Object current,Node next){
        this.next=next;
        this.current=current;
    }

    Object getPre(){
        return this.pre;
    }
    Object getCurrent(){
        return this.current;
    }
    Object getNext(){
        return this.next;
    }
    void setPre(Node pre){
        this.pre=pre;}

    void setNext(Node next){
        this.next=next;
    }
    void setCurrent( Object current){
         this.current=current;
    }

    public static void main(String[] args) throws Exception {
        LList l = new LList();
        l.add("cows");
        l.add("cats");
        System.out.println(l.next);
        
    }
}