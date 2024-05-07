package com.exception.bookManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stock {
    private List<BookItem> books;

    public Stock() {
    }

    public Stock(List<BookItem> books) {
        this.books = books;
    }

    public List<BookItem> getBooks() {
        return books;
    }

    public void setBooks(List<BookItem> books) {
        this.books = books;
    }

    //查找图书下标
    private int getIndex(String ISBN) {
        if (books == null)
            return -1;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBook().getISBN().equals(ISBN)) {
                return i;
            }
        }
        return -1;
    }

    //查找图书
    public Book findBook() throws BookNotFoundException {
        System.out.print("请输入图书的ISBN：");
        Scanner scanner = new Scanner(System.in);
        String ISBN = scanner.next();
        int index = getIndex(ISBN);
        if (index == -1) {
            throw new BookNotFoundException("找不到此书");
        }
        return books.get(index).getBook();
    }

    //添加图书
    public boolean addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要添加的图书类型 [1]小说  [2]非小说:");
        int type = scanner.nextInt();
        if (type != 1 && type != 2) {
            System.out.println("无效的图书类型");
            return false;
        }
        System.out.print("请输入ISBN号：");
        String ISBN = scanner.next();
        if (getIndex(ISBN) != -1) {
            System.out.println("ISBN号重复，该书已存在");
            return false;
        }
        System.out.print("请输入书名：");
        String name = scanner.next();
        System.out.print("请输入作者：");
        String author = scanner.next();
        System.out.print("请输入价格：");
        double price = scanner.nextDouble();
        Book book = null;
        if (type == 1) {
            System.out.print("请输入受众年龄段：");
            String level = scanner.next();
            try {
                book = new FictionBook(name, author, price, ISBN, level);
            } catch (ISBNIllegalException e) {
                e.printStackTrace();
                return false;
            }
        } else {
            System.out.println("请输入主题：");
            String topic = scanner.next();
            try {
                book = new NonFictionBook(name, author, price, ISBN, topic);
            } catch (ISBNIllegalException e) {
                e.printStackTrace();
                return false;
            }
        }
        books.add(new BookItem(book, Statue.NOLEND));
        return true;
    }

    //删除图书
    public boolean deleteBook() throws BookNotFoundException {
        System.out.print("请输入图书的ISBN：");
        Scanner scanner = new Scanner(System.in);
        String ISBN = scanner.next();
        int index = getIndex(ISBN);
        if (index == -1) {
            throw new BookNotFoundException("找不到此书");
        }
        books.remove(index);
        return true;
    }

    //展示所有图书
    public void display() {
        if (books == null || books.isEmpty()) {
            System.out.println("图书馆为空");
            return;
        }
        for (BookItem bookItem : books) {
            System.out.println(bookItem);
        }
    }

    //借书
    public boolean lendBook() throws BookNotFoundException {
        System.out.print("请输入图书的ISBN：");
        Scanner scanner = new Scanner(System.in);
        String ISBN = scanner.next();
        int index = getIndex(ISBN);
        if (index == -1) {
            throw new BookNotFoundException("找不到此书");
        }
        return books.get(index).lendBook();
    }

    //还书
    public boolean returnBook() throws BookNotFoundException {
        System.out.print("请输入图书的ISBN：");
        Scanner scanner = new Scanner(System.in);
        String ISBN = scanner.next();
        int index = getIndex(ISBN);
        if (index == -1) {
            throw new BookNotFoundException("找不到此书");
        }
        return books.get(index).returnBook();
    }
}
