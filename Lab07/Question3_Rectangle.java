package Lab07;

public class Question3_Rectangle {
    int length;
    int breadth;

    public Question3_Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("area is " + (length * breadth));
    }

    public void perimeter() {
        System.out.println("perimeter  is " + (2 * (length + breadth)));

    }
}