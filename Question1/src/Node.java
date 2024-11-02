public class Node<T> {
    private T info;
    private Node<T> next;
    private Node<T> pre;

    public Node(){

    }
    public Node(T info,Node<T> next){
        this.next=next;
        this.info=info;
    }
    Node<T> getPre(){
        return this.pre;
    }
    T getInfo(){
        return this.info;
    }
    Node<T> getNext(){
        return this.next;
    }
    void setPre(Node<T> pre){
        this.pre=pre;}

    void setNext(Node<T> next){
        this.next=next;
    }
    void setInfo( T info){
         this.info=info;
    }

    public static void main(String[] args) throws Exception {
       

    }
}