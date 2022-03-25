package decoratePattern;

public class Americano extends Coffee {

    @Override
    protected void brewing() {
        System.out.print("Americano ");
    }
}
