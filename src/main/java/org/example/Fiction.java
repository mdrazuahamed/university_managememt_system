package org.example;

public class Fiction extends Book {
    public Fiction(){

    }

    public Fiction(String name, String country, Author author, int price, String genre) {
        super(name, country, author, price, genre);
    }

    public Fiction(Book book){
        super(book);
    }
    public String getAuthorNameExtd(){
        return super.getAuthorName();
    }

}
