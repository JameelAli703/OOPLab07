package Lab07;

class Mian3 {
    public static void main(String[] args) {
        Question3_Rectangle rectangle = new Question3_Rectangle(10, 5);
        Question3_Rectangle square = new Question3_Square(10);
        rectangle.area();
        rectangle.perimeter();
        System.out.println();
        square.area();
        square.perimeter();

    }
}

