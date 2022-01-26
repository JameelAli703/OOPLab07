package Lab07;

public class Question4_Rectangle2 {
    int height;

    public Question4_Rectangle2() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Question4_Rectangle2(int a, int b){
        height=a;
        width=b;


    }
    public String tostring(){
        String output="Surface area of rectangle";
        return output;
    }
    public int computesurfacearea(){
        int area= height*width;
        return area;
    }
}
