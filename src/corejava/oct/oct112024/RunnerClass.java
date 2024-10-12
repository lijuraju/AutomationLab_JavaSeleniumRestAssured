package corejava.oct.oct112024;

public class RunnerClass {

    public static void main(String[] args) {
        //Object of child has created here
        TestcaseAPI child = new TestcaseAPI(10);

        //Dynamic dispatching
     BaseTests parent =    new TestcaseAPI(99);

        System.out.println("Age is "+ child.age);

     //parent can't access the child class method

        //child class can access parent class method
        child.performPATCH();
        child.performGET();
        child.performPOST(10);
        child.performPUT();
        child.performDELETE();


        //Encapsulation is done here
        child.setId(1);
        child.setName("Raj");
        child.getName();
        child.getId();





    }
}
