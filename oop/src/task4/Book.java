package task4;

public class Book {
    private String name;
    private String author;

    public Book (String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book() {

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void info() {
        System.out.println(
                "название: " + name +
                ", автор: " + author
        );
    }
}
