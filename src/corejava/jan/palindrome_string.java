package corejava.jan;

public class palindrome_string {
    public static void main(String[] args) {

        String str = "malayalam";

        //str = str.toLowerCase();

        int length = str.length();

        for(int i =0; i<length/2;i++)
        {
            if(str.charAt(i) != str.charAt(length-1-i))
            {

                System.out.println("Not a palundrome");
                break;

            }

            else
                System.out.println(" palundrome");


        }




    }
}
