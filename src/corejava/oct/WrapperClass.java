package corejava.oct;

public class WrapperClass {

    //Wrapper classes convert primitive data types into objects

    //int to Integer
    //byte to Byte
    //char to Character

    //Autoboxing - Converting primitive data type into objects

    int a =5;
    Integer aObject = a;

    //Unboxing - Converting objects into primitive data types

    Integer bObject = 5;
    int b = bObject;

    //Why Java is Not Pure OOP
    //Java is often considered not to be a pure Object-Oriented Programming (OOP) language because:
    //Primitive Types: Java supports primitive data types that are not objects. While it provides wrapper classes for these primitives,
    // the existence of primitives means that Java does not adhere strictly to the OOP principle where everything should be treated as an object.
    //Static Methods and Variables: Java allows static methods and variables that belong to a class rather than instances of the class,
    // ````which deviates from pure OOP principles where methods should operate on instance data




}
