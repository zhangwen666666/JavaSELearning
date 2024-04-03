//编写程序实现单向链表数据结构：

import java.util.LinkedList;

public class LinkList<E> {
    private Node<E> first = null;
    private Node<E> last = null;
    private int size = 0;


    public boolean add(E e) {
        addLast(e);
        return true;
    }

    //在尾部添加元素
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
            last = newNode;
            size++;
            return;
        }
        last.setNext(newNode);
        last = newNode;
        size++;
    }

    //在头部添加元素
    public void addFirst(E e) {
        if (first == null) {
            Node<E> newNode = new Node<>(e);
            first = newNode;
            last = newNode;
            size++;
            return;
        }
        first = new Node<>(e, first);
        size++;
    }


    //获取指定索引处的节点
    Node<E> node(int index) {
        if (index >= size)
            throw new OutOfIndexException("下标越界");
        if (index < 0)
            throw new OutOfIndexException("下标不合法");
        Node<E> cur = first;
        for (int i = 0; i < index; i++) {
            cur = cur.getNext();
        }
        return cur;
    }

    //在指定下标处插入元素
    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
            size++;
            return;
        }
        Node<E> pre = node(index - 1);
        Node<E> newNode = new Node<>(e, pre.getNext());
        pre.setNext(newNode);
        size++;
    }

    //删除第一个元素
    public E removeFirst() {
        if (size == 0) return null;
        E ret = first.getData();
        if (size == 1) {
            first = null;
            last = null;
        } else {
            first = first.getNext();
        }
        size--;
        return ret;
    }

    //删除最后一个元素
    public E removeLast() {
        if (size == 0) return null;
        E ret = last.getData();
        if (size == 1) {
            first = null;
            last = null;
        } else {
            Node<E> cur = first;
            while (cur.getNext() != last) {
                cur = cur.getNext();
            }
            last = cur;
        }
        size--;
        return ret;
    }

    //删除指定下标的元素
    public E remove(int index) {
        if (index >= size)
            throw new OutOfIndexException("下标越界");
        if (index < 0)
            throw new OutOfIndexException("下标不合法");
        if (index == 0)
            return removeFirst();
        Node<E> pre = node(index - 1);
        E ret = pre.getNext().getData();
        pre.setNext(pre.getNext().getNext());
        size--;
        return ret;
    }

    //查找下标为i的元素
    public E get(int i) {
        return node(i).getData();
    }

    //查找首元素
    public E getFirst() {
        return get(0);
    }

    //查找最后一个元素
    public E getLast() {
        return get(size - 1);
    }

    //修改下标为i的元素
    public E set(int i, E e) {
        Node<E> old = node(i);
        E oldValue = old.getData();
        old.setData(e);
        return oldValue;
    }

    //修改首元素
    public E setFirst(E e) {
        return set(0, e);
    }

    //修改尾元素
    public E setLast(E e) {
        return set(size - 1, e);
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0) return "列表为空";
        String result = "";
        Node<E> cur = first;
        for (int i = 0; i < size; i++, cur = cur.getNext()) {
            result = result + cur.getData().toString() + " ";
        }
        return result;
    }
}

class Test {
    public static void main(String[] args) {
        LinkList<Integer> l = new LinkList<>();
        System.out.println(l.size());
        l.add(10);
        System.out.println(l.size());
        l.add(20);
        l.add(30);
        l.addFirst(66);
        System.out.println(l.size());
        System.out.println(l);
        System.out.println(l.node(1));
        l.add(3, 55);
//        System.out.println(l);
//        Integer i = l.removeFirst();
//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(l.removeLast());
//        System.out.println(l.remove(0));
//        System.out.println(l);
//        System.out.println(l.remove(3));
//        System.out.println(l);
//        for(int i = 0;i<l.size();i++){
//            System.out.print(l.get(i) + " ");
//        }
//        System.out.println(l);
//        System.out.println(l.set(3, 2));
//        System.out.println(l);
        System.out.println(l);
        System.out.println(l.setFirst(1));
        System.out.println(l.setLast(-1));
        System.out.println(l);
    }
}


class OutOfIndexException extends RuntimeException {
    public OutOfIndexException() {
    }

    public OutOfIndexException(String message) {
        super(message);
    }
}