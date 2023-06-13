public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return title + ": " + author.toString() + ", " + year;
    }

    public boolean equals(Object other) {
        if(this.getClass() != other.getClass()) return false;
        Book otherBook = (Book) other;
        return (otherBook.title.equals(title) && otherBook.getYear() == year && otherBook.author.equals(author));
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(title, year, author);
    }
}