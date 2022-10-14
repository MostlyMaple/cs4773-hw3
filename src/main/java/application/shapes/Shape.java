package application.shapes;

public class Shape {
    private Color color;
    private Origin origin;

    public Shape(Color color, Origin origin) {
        this.color = color;
        this.origin = origin;
    }

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Origin getOrigin() {
		return origin;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

}
