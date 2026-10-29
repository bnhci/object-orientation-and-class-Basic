package library;

public class Member {
    String name;
    String member;
    int number;
    Book borrowedBook;

    public Member(String name, String member, int number) {
        this.name = name;
        this.member = member;
        this.number = number;
        this.borrowedBook = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", member='" + member + '\'' +
                ", number=" + number +
                ", borrowedBook=" + borrowedBook +
                '}';
    }
}
