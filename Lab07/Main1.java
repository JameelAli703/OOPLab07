package Lab07;

public class Main1 {
    public static void main(String[] args) {
        //object of child class called
        Question1_Child obj1=new Question1_Child();
        obj1.child();
        //object of parent class called
        Question1_Parent obj2=new Question1_Parent();
        obj2.parent();
        //method of parent class called by child object
        obj1.child();
        obj1.parent();

    }
}
