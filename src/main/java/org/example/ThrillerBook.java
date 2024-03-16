package org.example;

public class ThrillerBook extends Book {
    private int discount=5;

    public ThrillerBook(){

    }

    public ThrillerBook(String name, String country, Author author, int price, String genre) {
        super(name, country, author, price, genre);
    }

    public ThrillerBook(Book book){
        super(book);
    }

    public String getAuthorNameExtd(){
        return super.getAuthorName();
    }

    public int getDiscount() {
        return discount;

    }
}
