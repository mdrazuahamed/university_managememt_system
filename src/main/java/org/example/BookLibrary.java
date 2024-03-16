package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BookLibrary {
    private List<ThrillerBook> thrillerBook = new ArrayList<>();
    private List<ComicBook> comicBook = new ArrayList<>();
    private List<ActionBook> actionBook = new ArrayList<>();
    private List<Book> bookList = new ArrayList<>();

    @Override
    public String toString() {
        return "BookLibraryExtd{" +
                "thrillerBook=" + thrillerBook +
                ", comicBook=" + comicBook +
                ", actionBook=" + actionBook +
                '}';
    }

    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.addBooks();
        System.out.println(bookLibrary.bookList);
        Scanner takeAuthorName = new Scanner(System.in);
        System.out.println("Available writer is \n 1) Kazi Nozrul Islam \n 2) Rabindranath Tagore \n Type a name Writer Name From Above: \n");
        String strForAuthor = takeAuthorName.nextLine();
        bookLibrary.giveAuthorName(strForAuthor.toLowerCase(), bookLibrary.bookList);
    }

    public void addBooks() {
        Author kaziNozrul = new Author();
        kaziNozrul.setName("kazi nozrul islam");
        kaziNozrul.setAge(51);
        kaziNozrul.setCountry("India");

        ThrillerBook mirtuKhudaInherite = new ThrillerBook("Mirtu Khuda","India",kaziNozrul,500,"Thriller");
        bookList.add(mirtuKhudaInherite);

        ComicBook badhonHaraInherite = new ComicBook("Badhon hara", "India", kaziNozrul, 600, "Comic");
        bookList.add(badhonHaraInherite);

        ThrillerBook shulimalaInheritance = new ThrillerBook("Shuli Mala", "India",kaziNozrul,650, "Thriller");
        bookList.add(shulimalaInheritance);

        ActionBook kuhelikaInherite = new ActionBook("Kuhelika", "India",kaziNozrul, 750,"Action");
        bookList.add(kuhelikaInherite);

        ComicBook gitanjaliInherite = new ComicBook("Gitan Jali",  "India", new Author("rabindranath tagore", 58, "India"), 800, "Comic");
        bookList.add(gitanjaliInherite);

        Author robiThakur = new Author("rabindranath tagore", 58, "India");
        ComicBook kabuliWalaInherite = new ComicBook("KabuliWala", "India", robiThakur, 800, "Comic");
        bookList.add(kabuliWalaInherite);

        ThrillerBook theHomeAndTheWorldInherite = new ThrillerBook("The Home and the World", "India", robiThakur, 1000, "Thriller");
        bookList.add(theHomeAndTheWorldInherite);

        Fiction fiction = new Fiction("Ami Tomake Chai", "India", robiThakur, 1000, "Thriller");
        bookList.add(fiction);
    }

    public void giveAuthorName(String authorName, List<Book> bookList) {
        int bookNumber = 0;
        int actionBookNumber = 0;
        int comicBookNumber = 0;
        int price = 0;
        double finalPrice;

        for (Book i : bookList) {
            if (Objects.equals(i.getAuthorName(), authorName)) {
                bookNumber++;
                price = i.getPrice();
                int discount = i.getDiscount();
                finalPrice = price - price * discount / 100;
                System.out.printf(" %d) Book name\t= %s\t Price = %.2f", bookNumber, i.getName(), finalPrice);
                System.out.println("\n-------------------------------");
            }
        }
    }
}


