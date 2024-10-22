package corejava.oct.oct172024;
import java.lang.String;



class StaticMethodExample {

    static void showMethod() {
        System.out.println("This is a static method");
    }

}

public class StaticMethod{

    public static void main(String[] args) {
        StaticMethodExample.showMethod();
    }
}
