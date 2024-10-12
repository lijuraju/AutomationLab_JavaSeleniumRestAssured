package corejava.oct.oct122024;

public class ParameterisedConstructor {

    String name;
    int age;

    ParameterisedConstructor(){
        this.name = "Raj";
        this.age = 100;
    }

    ParameterisedConstructor(int age,String name){
       this.age = age;
       this.name = name;
        System.out.println("Parameterized constructor called");
    }

    public static void main(String[] args) {
        ParameterisedConstructor obj = new ParameterisedConstructor(999,"Rajparametrized");
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
