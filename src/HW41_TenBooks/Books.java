package HW41_TenBooks;

/**
 * FirstNewVersion
 * 18.06.2020
 */
public class Books {
    private String name;
    private int pages;
    double price;
    private String idNumber;

    Books() {
    }

    public Books(String name, int pages, double price, String idNumber) {//для инициализации книг
        this.name = name;
        this.pages = pages;
        this.price = price;
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIdNumber(String idNumber) {
        if (idNumber.length() == 4) {
            this.idNumber = idNumber;
        } else System.out.println("Wrong number");
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setPages(int pages) {
        System.out.println("Количество страниц не изменяется");
    }

    public int getPages() {
        return pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String printIt() {
        return (name + " price is " + price);
    }
}

class booksList {
    public static void main(String[] args) {
        Books book1 = new Books("Азбука", 30, 6.5, "1120");
        Books book2 = new Books("Моя гениальная подруга", 215, 10.8, "2574");
        Books book3 = new Books("Сборник рассказов", 45, 8.45, "6817");
        Books book4 = new Books("Незнайка на Луне", 10, 2.9, "3221");
        Books book5 = new Books("Сказки народов мира", 95, 17.4, "3381");
        Books book6 = new Books("Сонечка", 34, 8.3, "5297");
        Books book7 = new Books("Узорный покров", 55, 12.4, "3611");
        Books book8 = new Books("Правила виноделов", 248, 18.7, "1559");
        Books book9 = new Books("Китаец", 389, 18.80, "6248");
        Books book10 = new Books("Грокаем алгоритмы", 290, 20.1, "6281");

        Books[] allBooks = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        for (Books element : allBooks) {
            // System.out.println(element.getIdNumber() + " " + element.getName() + ", price, EUR: " + element.getPrice());
        }

//        System.out.println("ID of the book1 is " + book1.getIdNumber());
//        System.out.println(book3.getName() + " has " + book3.getPages() + " pages");

        Books[] sortBooks = bubbleSort(allBooks);
        for (Books element : sortBooks) {
            System.out.println(element.printIt());
        }
    }

    private static Books[] bubbleSort(Books[] allBooks) {
        boolean unsorted = true;
        while (unsorted) {
            int count = 0;
            for (int i = 0; i < allBooks.length - 1; i++) {
                if (allBooks[i].price > allBooks[i + 1].price) {
                    double temp = allBooks[i].price;
                    allBooks[i].price = allBooks[i + 1].price;
                    allBooks[i + 1].price = temp;
                }
            }
            if (count == 0) {
                unsorted = false;
            }
        }

        return allBooks;
    }
}

