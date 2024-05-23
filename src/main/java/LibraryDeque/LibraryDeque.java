package LibraryDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class LibraryDeque {
    private Deque<Book> bookDeque = new LinkedList<>();

    public void addFirst(Book book) {
        bookDeque.addFirst(book);
    }

    public void addLast(Book book) {
        bookDeque.addLast(book);
    }

    public Book removeFirst() {
        return bookDeque.pollFirst();
    }

    public Book removeLast() {
        return bookDeque.pollLast();
    }

    public boolean searchBook(Book book) {
        return bookDeque.contains(book);
    }

    public void iterateBooks() {
        Iterator<Book> iterator = bookDeque.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return "LibraryDeque{" +
                "bookDeque=" + bookDeque +
                '}';
    }
}
