package org.example;

public class ComicBook extends Book {
    private int discount=10;

    public ComicBook() {
    }

    public ComicBook(String name, String country, Author author, int price, String genre) {
        super(name, country, author, price, genre);
    }

    public ComicBook(Book book) {
        super(book);
    }

    public int getDiscount() {
        return discount;
    }

    public String getAuthorNameExtd(){
        return super.getAuthorName();
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
