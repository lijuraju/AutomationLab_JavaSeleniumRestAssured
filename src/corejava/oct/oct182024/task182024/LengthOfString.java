package corejava.oct.oct182024.task182024;

public class LengthOfString {
    public static void main(String[] args) {

        String str1 = "Reshma";
        int count =0;

        for(int i =0; i<str1.length(); i++){

            if(str1.charAt(i) == '/'){
                break;

            }
            else
                count++;
        }
        System.out.println("Length of the string is "+count);
    }
}
