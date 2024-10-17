package corejava.oct.oct172024;

public class Enum {
    enum Days{
        Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
    }

    public static void main(String[] args) {
        Days day0 = Days.Sunday;
        Days day1 = Days.Monday;
        System.out.println(day0);
        System.out.println(day1);

    }
}
