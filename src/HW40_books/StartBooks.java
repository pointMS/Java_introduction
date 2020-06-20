package HW40_books;

/**
 * BC12Morning
 * 17.06.2020
 */
public class StartBooks {
    public static <allInTheShop> void main(String[] args) {
        Books book1 = new Books(40.3);
        book1.name = "English-Russian dictionary";
        book1.author = "John Muller";
        book1.cover = "hard";
        book1.editionYear = 2012;
        book1.genre = "education";
        book1.isbn = 547811256;
        book1.pages = 542;
        book1.pictures = "no";
        book1.price = 40.30;

        Books book2 = new Books(1296);
        book2.name = "War and peace";
        book2.author = "Lev Tolstoy";
        book2.cover = "hard";
        book2.editionYear = 1995;
        book2.genre = "roman";
        book2.isbn = 124895008;
        book2.pages = 1296;
        book2.pictures = "no";
        book2.price = 35.2;

        Books book3 = new Books();
        book3.name = "Moon calender";
        book3.author = "Petr Ivanov";
        book3.cover = "hard";
        book3.editionYear = 2018;
        book3.genre = "House and garden";
        book3.isbn = 510050733;
        book3.pages = 65;
        book3.pictures = "photos";
        book3.price = 15.5;

        Books book4 = new Books();
        book4.name = "Murder on the Orient Express";
        book4.author = "Agatha Christie";
        book4.cover = "soft";
        book4.editionYear = 1988;
        book4.genre = "Crime";
        book4.isbn = 12345789;
        book4.pages = 256;
        book4.pictures = "yes";
        book4.price = 22.15;

        Books book5 = new Books("Karlson on the Roof", "Astrid Lindgren");
        book5.name = "Karlson on the Roof";
        book5.author = "Astrid Lindgren";
        book5.cover = "soft";
        book5.editionYear = 1999;
        book5.genre = "For children";
        book5.isbn = 201483672;
        book5.pages = 30;
        book5.pictures = "yes";
        book5.price = 10.99;

        book1.moveToSchool();
        book2.moveToSchool();
        System.out.println(" - - - - ");
        book3.makeSale();
        book5.makeSale();
        System.out.println(" - - - - ");
        book1.orderAdditional();
        book4.orderAdditional();
        System.out.println(" - - - - ");
        book3.placeToWindow();
        System.out.println(" - - - - ");

        Books[] allInTheShop = {book1, book2, book3, book4, book5};
        for (Books element : allInTheShop) {
            element.printForCatalogue();
            System.out.println();
        }

    }
}
