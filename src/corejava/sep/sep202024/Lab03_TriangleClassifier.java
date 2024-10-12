package corejava.sep.sep202024;

public class Lab03_TriangleClassifier {
    public static void main(String[] args) {
        int a= 60;
        int b = 30;
        int c =90;

        if ( (a== b) && b == c && a== c)
        {
            System.out.println("Equilateral Trainagle");
        } else if( (a== b) || b == c || a== c) {
            System.out.println("IScosceles Triangle");
        }
        else
        {
            System.out.println("scalene traingle");
        }
    }
    }

