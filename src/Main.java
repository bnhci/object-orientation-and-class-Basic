import library.Book;
import library.Member;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Book javaLearn = new Book("Java for junior", "NoName", LocalDate.of(2001, 1, 1));
        Book pythonLearn = new  Book("Python for junior", "SomeName", LocalDate.of(2001, 3, 22));

        Member newMember = new Member("SomeNmae", "Author", 5);

        newMember.setBorrowedBook(javaLearn);

        System.out.println(newMember.toString());
    }
}
