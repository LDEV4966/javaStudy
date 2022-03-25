package decoratePattern;

//An abstract class is a class that is declared abstract
// —it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed
public abstract class Decorator extends Coffee{

    Coffee coffee;

    public Decorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    protected void brewing() {
        coffee.brewing();
    }
}
