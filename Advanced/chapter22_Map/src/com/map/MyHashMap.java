package com.map;

import java.util.Objects;

public class MyHashMap<K, V> {
    private Node<K, V>[] tables;
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashMap(int capacity) {
        this.tables = new Node[capacity];
        this.size = 0;
    }


    public MyHashMap() {
        this(16);
    }


    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
        int hash;

        public Node(K key, V value, Node<K, V> next, int hash) {
            this.key = key;
            this.value = value;
            this.next = next;
            this.hash = hash;
        }

        @Override
        public String toString() {
            return "[" +
                    "key=" + key +
                    ", value=" + value +
                    ", hash=" + hash +
                    ']';
        }
    }

    public V put(K key, V value) {
        if (key == null) {
            return putForNullKey(value);
        }
        return putForNotNullKey(key, value);
    }

    private V putForNotNullKey(K key, V value) {
        int hash = Math.abs(key.hashCode() % tables.length);
        Node<K, V> node = this.tables[hash];
        if (node == null) {
            this.tables[hash] = new Node<>(key, value, null, hash);
            size++;
            return value;
        }
        while (node.next != null && node.key != key) {
            node = node.next;
        }
        if (node.key.equals(key)) {
//        if (node.key == key) {
            V oldValue = node.value;
            node.value = value;
            return oldValue;
        }
        node.next = new Node<>(key, value, null, hash);
        size++;
        return value;
    }

    private V putForNullKey(V value) {
        Node<K, V> node = this.tables[0];
        if (node == null) {
            tables[0] = new Node<K, V>(null, value, null, 0);
            size++;
            return value;
        }
        while (node.next != null && node.key != null) {
            node = node.next;
        }
        if (node.key == null) {
            V oldValue = node.value;
            node.value = value;
            return oldValue;
        }
        node.next = new Node<K, V>(null, value, null, 0);
        size++;
        return value;
    }

    public V get(K key) {
        if (key == null) {
            Node<K, V> node = this.tables[0];
            if (node == null) return null;
            while (node.next != null && node.key != null) {
                node = node.next;
            }
            if (node.key == null) return node.value;
            return null;
        }
        int hash = Math.abs(key.hashCode() % tables.length);
        Node<K, V> node = this.tables[hash];
        if (node == null) return null;
        while (node.next != null && node.key != key) {
            node = node.next;
        }
        if (node.key.equals(key)) return node.value;
        return null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0)
            return null;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < tables.length; i++) {
            s.append("下标为[" + i + "]处：");
            Node<K, V> node = tables[i];
            while (node != null) {
                s.append(node);
                s.append("   ");
                node = node.next;
            }
            s.append("\n");
        }
        return s.toString();
    }
}

class Main {
    public static void main(String[] args) {
        MyHashMap<Animal, String> map = new MyHashMap<>(10);
        map.put(new Animal(1), "zhangsan");
        map.put(new Animal(2), "lisi");
        map.put(new Animal(3), "wangwu");
        map.put(new Animal(4), "zaholiu");
        map.put(new Animal(1), "sunquan");
        map.put(new Animal(6), "liubei");
        map.put(null, "wumingshi");

        System.out.println(map);
        System.out.println(map.get(new Animal(7)));
    }
}

class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}