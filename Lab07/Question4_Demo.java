package Lab07;

public class Question4_Demo {
    public static void main(String[] args) {
        Question4_Rectangle2 obj1= new Question4_Rectangle2(3,6);

        System.out.println(obj1.tostring());
        System.out.println(obj1.computesurfacearea());
        Question4_Rectprism obj2=new Question4_Rectprism(3,7,8);
        System.out.println(obj2.tostring());
        System.out.println(obj2.volume());
        System.out.println(obj2.computesurfacearea());

    }
}
