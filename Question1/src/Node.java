

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
        LList<Integer> list = new LList<>();
        list.addEnd(4);
        list.addEnd(9);
        list.addEnd(6);
        list.addEnd(1);
        list.addEnd(2);
        list.addEnd(8);
        list.addEnd(5);
        list.addEnd(7);
        list.addEnd(3);
        System.out.println(list.size());
        list.sort();
        list.displayForward();
        System.out.println("\n");
        list.displayBackward();
    }
}