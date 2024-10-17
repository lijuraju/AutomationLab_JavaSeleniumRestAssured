package corejava.oct.oct172024;

public class StaticVariable {

    static int count;
    StaticVariable(int count){
        this.count = count;

    }

    public static void main(String[] args) {
        StaticVariable sv1 = new StaticVariable(10);
        StaticVariable sv2 = new StaticVariable(20);
        StaticVariable sv3 = new StaticVariable(30);

        System.out.println(sv1.count);
        System.out.println(sv2.count);
    }
}
