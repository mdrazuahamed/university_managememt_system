package org.example;

public abstract class Book {
    private String name;
    private String country;
    private Author author;
    private int price;
    private String genre;
    protected int protec;

    public int getProtec() {
        return protec;
    }

    public void setProtec(int protec) {
        this.protec = protec;
    }

    public Book(){

    }

    public Book(String name, String country, Author author, int price, String genre) {
        this.name = name;
        this.country = country;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    public Book(Book book) {
        name = book.name;
        country = book.country ;
        author = book.author ;
        price = book.price ;
        genre = book.genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }
    public String getAuthorName(){
        return author.getName();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //public abstract int getDiscount();
    public int getDiscount(){
        System.out.println("In book extended class");
        return 15;
    }

    @Override
    public String toString() {
        return "BookExtd{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                '}';
    }
}
