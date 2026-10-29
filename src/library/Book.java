package library;

import java.time.LocalDate;

public class Book {
    String title;
    String author;
    LocalDate publishYare;

    public Book(String title, String author, LocalDate publishYare) {
        this.title = title;
        this.author = author;
        this.publishYare = publishYare;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishYare() {
        return publishYare;
    }

    public void setPublishYare(LocalDate publishYare) {
        this.publishYare = publishYare;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishYare=" + publishYare +
                '}';
    }
}
