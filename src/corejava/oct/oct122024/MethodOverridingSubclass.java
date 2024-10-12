package corejava.oct.oct122024;

public class MethodOverridingSubclass extends MethodOverrididngSuperclass {
    @Override
 void display(int a)
 {
     System.out.println("I am overriding the method in Super class to implememnet new features");

 }

 void show(String name)
 {
     System.out.println("In subclass,Method Overloading");
 }

    @Override
    void show() {
        super.show();
    }

    public static void main(String[] args) {
      MethodOverridingSubclass sb   = new MethodOverridingSubclass();
      sb.display(20);
      sb.show("Raj");
      sb.show();
    }


}
