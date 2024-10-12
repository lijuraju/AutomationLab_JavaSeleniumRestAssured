package corejava.sep.sep232024;

public class Lab02_BrowserExample {
    public static void main(String[] args) {

        String browser = "Chrome";

        switch (browser)
        {
            case "Chrome" -> System.out.println("Chrome is seected");

            case "Firefox" -> System.out.println("Firefox");


            default -> System.out.println("Invalid browser");



        }
        System.out.println("Out of wsitch");


    }
}
