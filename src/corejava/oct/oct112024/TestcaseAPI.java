package corejava.oct.oct112024;

public class TestcaseAPI extends BaseTests{

    int age;

    TestcaseAPI(int age){
        this.age = age;
    }

    //Single Inheritance is achieved here

    //Method overriding is done here
    @Override
    public void performGET(){
        System.out.println(" I am overriding parent method");
    }

    //Method overloading is done
    public void performPOST(int id){
        System.out.println(" I am overloading parent method");


    }

    public  void childMethod(){
        System.out.println("Child method");
    }

}
