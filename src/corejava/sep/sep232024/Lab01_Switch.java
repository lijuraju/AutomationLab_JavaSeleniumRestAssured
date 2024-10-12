package corejava.sep.sep232024;

public class Lab01_Switch {
    public static void main(String[] args) {
        String day1 = "Monday";

        switch (day1)
        {
            case "Monday":
                System.out.println("Monday");
                break;

            case "Tuesday":
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid");
                    break;
        }
        System.out.println("Out of switch");

    }
}
