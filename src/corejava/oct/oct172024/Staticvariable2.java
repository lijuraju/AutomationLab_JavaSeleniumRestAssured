package corejava.oct.oct172024;

public class Staticvariable2 {
    static int count =0;

Staticvariable2(){
    count++;
}

void showCount(){
    System.out.println("My count is"+count);
}

    public static void main(String[] args) {
        Staticvariable2 sv1 = new Staticvariable2();
        Staticvariable2 sv2 = new Staticvariable2();
        sv1.showCount();
        sv2.showCount();



    }
}
