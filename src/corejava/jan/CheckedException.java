package corejava.jan;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("abc.txt");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void readData() throws FileNotFoundException
    {
        FileReader file = new FileReader("abc.txt");
    }
}
