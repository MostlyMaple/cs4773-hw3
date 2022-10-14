package application.shapes;

public class Circle extends Shape {
    
    private int radius;

    public Circle(Color color, Origin origin, int radius) {
        super(color, origin);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle, Color: " + super.color + ", Origin: " + super.origin.toString() + ", Radius: " + this.radius;
    }

}

