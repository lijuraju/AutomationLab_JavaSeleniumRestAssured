package corejava.jan;

public class Fibonacci {

    // 0 1 1 2 3 5 8 13 21 34 55 89 144

    //int fnum =0;
    //int snum =1;

    public static void main(String[] args) {

        int fnum =0;
        int snum =1;

        int sum =0;

        System.out.print(fnum+ " " +snum);
        for (int i= 2; i<10;i++)
        {
            sum = fnum + snum;
            System.out.print(" " + sum);
            fnum = snum;
            snum = sum;
        }
    }
}
