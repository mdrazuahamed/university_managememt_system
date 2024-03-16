package org.example;

public class ActionBook extends Book {
    private int discount=15;

    public ActionBook(int discount) {
        this.discount = discount;
    }

    public ActionBook(String name, String country, Author author, int price, String genre) {
        super(name, country, author, price, genre);
    }

    public ActionBook(Book book) {
        super(book);
    }

    public ActionBook() {
    }

    public String getAuthorNameExtd(){
        return super.getAuthorName();
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
