package library;

public class Member {
    String name;
    String member;
    int number;

    public Member(String name, String member, int number) {
        this.name = name;
        this.member = member;
        this.number = number;
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

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", member='" + member + '\'' +
                ", number=" + number +
                '}';
    }
}
