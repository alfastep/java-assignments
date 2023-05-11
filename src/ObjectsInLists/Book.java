package ObjectsInLists;

public class Book {
    private String title;
    private int numPages;
    private int year;

    public Book(String title, int numPages, int year) {
        this.title = title;
        this.numPages = numPages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getNumPages() + " pages, " + getYear();
    }
}
