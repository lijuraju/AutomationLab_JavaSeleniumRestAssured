package corejava.jan;

public class RevString {

    public static void main(String[] args) {


        String str = "Good morning";

        String rev = "";

        for(int i=str.length()-1;i>=0;i--){

            rev = rev+str.charAt(i);
        }
        System.out.println("Reverse: "+rev);
    }
}
