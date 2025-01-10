package Chapter3.Decorator.starbuzzcoffee;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI }

    protected String description = "Unknown Beverage";
    protected Size size = Size.TALL;

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return size;
    }
}
