package corejava;

public class Day4_StringPalindrome {

    public static void main(String[] args) {


        String str = "Liju";

        int left = 0;
        int right = str.length() - 1;
        boolean ispalindrome = true;

        while(left < right)
        {
            if (str.charAt(left) != str.charAt(right))
            {
                ispalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(ispalindrome)
            System.out.println("palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
