package corejava.oct.oct122024;

public class Constructor {

    int age;
    String name ;


Constructor(int age,String name){
       this.age = age;
        this.name = name;

        System.out.println("Parameterized constructor called");
}

    public static void main(String[] args) {
        Constructor obj = new Constructor(100000,"Rajparametrized");
        System.out.println(obj.age);
        System.out.println(obj.name);


    }
}
