package Lab07;

public class Question4_Rectprism extends Question4_Rectangle2 {
    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    int depth;
    public Question4_Rectprism(int a, int b, int c){
        height=a;
        width=b;
        depth=c;

    }
    public int volume(){
        int vol=height*width*depth;
        return vol;
    } public String tostring(){
        String output="volume of rectangle";
        return output;
    }
    public int computesurfacearea(){
        int area= height*width;
        return area;
    }
}
