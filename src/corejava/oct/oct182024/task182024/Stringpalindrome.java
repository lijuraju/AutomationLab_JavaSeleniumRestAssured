package corejava.oct.oct182024.task182024;

public class Stringpalindrome {
    public static void main(String[] args) {

        String str1 = "Liju";

        String temp = "";

        for(int i= str1.length()-1;i>=0; i--){
            temp = temp + str1.charAt(i);

        }
        if(str1.equals(temp)){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a palindrome");
    }
}
