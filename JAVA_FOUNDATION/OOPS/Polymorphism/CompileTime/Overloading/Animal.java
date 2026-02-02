package OOPS.Polymorphism.CompileTime.Overloading;

public class Animal extends Cow{
    public static void main(String[] args) {
        Cow cow=new Cow();
        cow.Sound();
        cow.Sound(5);
        
    }
}
