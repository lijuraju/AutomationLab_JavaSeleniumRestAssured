package corejava.sep.sep252024;

public class Lab05_Vowels {
    public static void main(String[] args) {
        String str = "Liju Raju";
        System.out.println(str.length());
        int count =0;
        int consonants =0;

        for(int i =0; i<=str.length()-1;i++)
        {
            char s = str.charAt(i);
            if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u')
            {
                count++;
            } else if (s == ' ') {
                continue;
            }

            else
                consonants++;

        }
        System.out.println("Vowels: " + count);
        System.out.println("Consonants: " + consonants);
    }
}
