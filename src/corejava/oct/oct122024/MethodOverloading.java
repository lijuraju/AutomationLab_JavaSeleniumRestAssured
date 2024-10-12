package corejava.oct.oct122024;

public class MethodOverloading {

    class A {
        void show() {
            System.out.println("A");
        }

        void show(int a) {
            System.out.println("A int");
        }

        void show(String a) {
            System.out.println("A String");
        }

        void show(int a, String b) {
            System.out.println("A int String");
        }

        void  show(String a, int b) {
            System.out.println("A String int");
        }


    }
}
