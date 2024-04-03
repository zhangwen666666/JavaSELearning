public class Node<E> {
    private E data;
    private Node<E> next;

    public Node() {
    }

    public Node(E data) {
        this(data, null);
    }

    public Node(E data,Node<E> next){
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Node)) return false;
        if(this == obj) return true;
        Node<E> node = (Node<E>)obj;
        return this.data.equals(node.data);
    }

//    public static void main(String[] args) {
//        Node<String> n1 = new Node("hello");
//        Node<String> n2 = new Node("hello");
//        System.out.println(n1);
//        System.out.println(n1.equals(n2));
//    }
}
