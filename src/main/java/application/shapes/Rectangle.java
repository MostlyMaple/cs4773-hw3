package application.shapes;

public class Rectangle extends Shape {
    
    private int height;
    private int width;

    public Rectangle(Color color, Origin origin, int height, int width) {
        super(color, origin);
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String toString() {
        return "Rectangle, Color: " + super.color + ", Origin: " + super.origin.toString() + ", Width: " + this.width + ", Height: " + this.height;
    }

}
