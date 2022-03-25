package decoratePattern;

public class Mocka extends Decorator{

    public Mocka(Coffee coffee) {
        super(coffee);
    }

    @Override
    protected void brewing() {
        super.brewing();
        System.out.println("Add Mocka");
    }
}
