package HW40_books;

/**
 * BC12Morning
 * 17.06.2020
 */
public class Books {
    String name;
    String author;
    long isbn;
    int pages;
    int editionYear;
    double price;
    String cover;
    String pictures;
    String genre;

    public Books() {
    }

    public Books(double price) {
        System.out.println("New price = " + (price + 10));
        System.out.println(" - - - - ");
    }

    public Books(int pages) {
        System.out.println("Total pages: " + pages);
        System.out.println(" - - - - ");
    }

    public Books(String name, String author) {
        System.out.println("Our bestseller for children is: " + name + " from " + author);
        System.out.println(" - - - - ");
    }

    void moveToSchool() {
        System.out.println("Please move to school: this author: " + author + ", such genre: " + genre);
    }

    void makeSale() {
        System.out.println("Prepare for sale: such genre: " + genre + ", with such type of cover: " + cover);
    }

    void orderAdditional() {
        System.out.println("Order new pieces: such genre: " + genre + ", for the price " + price);
    }

    void placeToWindow() {
        System.out.println("Place to the show window: " + name + ", with pictures: " + pictures);
    }

    void printForCatalogue() {
        System.out.print("Name: " + name + "/ Author: " + author + "/ ISBN: " + isbn
                + "/ Total pages: " + pages + "/ Price: " + price);
    }

}
