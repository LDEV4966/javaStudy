package decoratePattern;

public class Expresso extends Coffee{

    @Override
    protected void brewing() {
        System.out.print("Expresso ");
    }
}
