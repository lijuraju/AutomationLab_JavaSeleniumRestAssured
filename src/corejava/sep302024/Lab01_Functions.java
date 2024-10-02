package corejava.sep302024;

public class Lab01_Functions {
    //Block of code which is reusable
    //1.Without return type and without arguments
    //2.With return type and without arguments
    //3.Without return type and with arguments
    //4.With return type and with arguments

    public static void main(String[] args) {
        //1.Without return type and without arguments
        addTest();
        //2.With return type and without arguments
        addTest1();
        //3.Without return type and with arguments
        addTest2(10,"Liju");
        //4.With return type and with arguments
        addTest3(10,30);



    }

    public static void addTest(){
        System.out.println("Add");
    }

    public static int addTest1()
    {
        System.out.println("Return type");
        return 0;
    }

    public static void addTest2(int a,String liju)
    {
        System.out.println(a);
        System.out.println(liju);
    }

    public static int addTest3(int a,int b)
    {
        return a+b;
    }
}
