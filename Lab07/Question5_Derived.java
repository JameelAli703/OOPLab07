package Lab07;

public class Question5_Derived extends Question5_Base {
    public Question5_Derived(){
        System.out.println("This is default2 constructor");
    }
    public Question5_Derived(String n){
        Name=n;
        System.out.println("My name is " +n);
    }

}
