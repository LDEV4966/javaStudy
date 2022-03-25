package decoratePattern;

public class CoffeeMachine {

    public static void main(String[] args) {
        Coffee americano = new Americano();
        americano.brewing();

        System.out.println();
        Coffee mockaCreamAmericano = new Mocka(new Cream(new Americano()));
        mockaCreamAmericano.brewing();

        System.out.println();
        Coffee expresso = new Expresso();
        expresso.brewing();

        System.out.println();
        Coffee mockaExpresso = new Mocka(new Expresso());
        mockaExpresso.brewing();


    }
}
