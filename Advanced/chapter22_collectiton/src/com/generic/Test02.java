package com.generic;

public class Test02 {
    public static void main(String[] args) {
        Integer[] arr1 = {2, 5, 7, 8};
        Animal a = Printer.print(arr1, new Animal());    //2 5 7 8
        System.out.println(a);//com.generic.Animal@34a245ab
    }
}

class Printer {
    public static <T, E> E print(T[] array,E elem) {
        if (array == null) {
            System.out.println("数组为空");
        } else {
            for (T t : array) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
        //elem.move();
        Animal animal = (Animal)elem;
        animal.move();
        return elem;
    }
}

