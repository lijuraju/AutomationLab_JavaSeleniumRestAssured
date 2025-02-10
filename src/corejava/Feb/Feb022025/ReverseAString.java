package corejava.Feb.Feb022025;

public class ReverseAString {
    public static void main(String[] args) {

        String str = "I am happy";
        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse: "+rev);
    }
}
