package corejava.sep.sep242024;

public class Lab02_RevereseString {
    public static void main(String[] args) {
        String s = "Good morning";
       String input = s.toLowerCase();

        String reverse = "";

        for(int i =input.length()-1;i>=0;i--)
        {
           reverse = reverse + input.charAt(i);



        }
        System.out.println("Reverse: " + reverse);

        if (input.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Plaindrome");
        }

    }
}
