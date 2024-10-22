package corejava.oct.oct182024;

public class ImmutabailityinJava {
    public static void main(String[] args) {

        //Intial assignemnet and declaration of Strings
        //Here str1 and str2 are pointing to the same memory location in String constant pool

        String str1 = "Heloo";
        String str2 = str1;

//        System.out.println(str1);
//        System.out.println(str2);


        //Here we are trying to change the value of str1
        //Now a new String is created in String constant pool and str1 is pointing to the new memory location
        //str2 is still pointing to the old memory location
        //this makes the String immutable
        str1 = str1 + " World";

        System.out.println(str1);
        System.out.println(str2);
    }
}
