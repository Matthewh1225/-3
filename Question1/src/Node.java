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

        list.addEnd(1696);
        list.addEnd(2367);
        list.addEnd(567);
        list.addEnd(752);
        list.addEnd(59232);
        System.out.println(list.size());
        list.sort();
        list.display();  
    }
}