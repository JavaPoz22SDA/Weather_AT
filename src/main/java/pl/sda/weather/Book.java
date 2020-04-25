package pl.sda.weather;

public class Book {

    public Book(){}

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private Integer numberOfPages;

    public Book(Integer numberOfPages, String title) {
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    private String title;

}
