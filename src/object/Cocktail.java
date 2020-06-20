package object;

/**
 * FirstNewVersion
 * 18.06.2020
 */
public class Cocktail {
    String name;
    Ingredient ingredient;

    Cocktail(String name, Ingredient... ingredients) {// ... - variable arguments
        this.name = name;
    }

    private void myPrint() {
        System.out.println("Your cocktail " + name + " is ready ");
    }

    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("Vodka", 30);
        Ingredient rom = new Ingredient("Rom", 30);
        Ingredient cola = new Ingredient("Cola", 50);

        Cocktail javaBomba = new Cocktail("Bomba", vodka, rom, cola);
        javaBomba.myPrint();
    }
}

class Ingredient {//объект - добавляет папку автоматически
    String ingrTitle;
    int liquid;

    Ingredient(String ingrTitle, int liquid) {
        this.ingrTitle = ingrTitle;
        this.liquid = liquid;
        System.out.println("Ingredient " + ingrTitle + liquid + " ml");
    }

}
