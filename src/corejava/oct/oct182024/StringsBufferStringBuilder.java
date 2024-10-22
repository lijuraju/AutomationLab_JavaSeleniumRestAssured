package corejava.oct.oct182024;

public class StringsBufferStringBuilder {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = str1.concat(" World");
        System.out.println(str1);
        System.out.println(str2);

        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" World");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Liju");
        sb2.append(" Raju");
        System.out.println(sb2);

    }
}
