package LibraryDeque;

public class Main {
    public static void main(String[] args) {

        LibraryDeque libraryDeque = new LibraryDeque();
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        libraryDeque.addFirst(book1);
        libraryDeque.addLast(book2);
        libraryDeque.addLast(book3);

        System.out.println("Initial Deque: " + libraryDeque);

        System.out.println("Iterating through books:");
        libraryDeque.iterateBooks();

        boolean found = libraryDeque.searchBook(book2);
        System.out.println("Book found: " + found);

        Book removedFirst = libraryDeque.removeFirst();
        System.out.println("Remove from front: " + removedFirst);

        Book removedLast = libraryDeque.removeLast();
        System.out.println("Remove from end: " + removedLast);

        System.out.println("Deque after remove: " + libraryDeque);
    }
}
