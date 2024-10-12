package corejava.oct.oct122024;

public class Runnerclass {

    public static void main(String[] args) {
         Subclass sb = new Subclass();
         sb.subshowAddress();
         sb.mdisplay();
         sb.name = "John";
         sb.age = 25;
         sb.address = "123, ABC Street";
         sb.pincode = 123456;


         GrandChildClass GC= new GrandChildClass();

         GC.mdisplay();
         GC.subshowAddress();

         MethodOverloading.A a = new MethodOverloading().new A();
         a.show();
            a.show(10);
           a.show("hello",10);
    }
}
