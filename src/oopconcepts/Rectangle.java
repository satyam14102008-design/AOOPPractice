
package oopconcepts;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {

        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                "Width and height must be positive."
            );
        }

        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 20);

        System.out.println(rect.getArea());
    }
}
