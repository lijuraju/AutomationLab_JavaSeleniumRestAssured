package corejava.oct.oct182024.task182024;

public class ReverseAString {
    public static void main(String[] args) {

        String str1 = "Liju";
        String temp = "";

        for(int i = str1.length()-1; i>=0; i--){
            temp = temp + str1.charAt(i);
        }
        System.out.println("Reversed string is "+temp);
    }
}
