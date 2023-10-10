public class Rectangle {

    private int length;
    private int width;

    // Constructor to initialise the length and width
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }

    public boolean ifSquare() {
        return length == width;
    }

}
