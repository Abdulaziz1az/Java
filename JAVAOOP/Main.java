import java.text.Annotation;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        a1.speak();
        System.out.println(a1);
        a2.speak();
        System.out.println(a2);
        a3.speak();
        System.out.println(a3);
    }
}
