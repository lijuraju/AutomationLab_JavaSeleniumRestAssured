package corejava.sep132024;

public class Lab03_RightTriangleStarPattern {
    public static void main(String[] args) {
        int n =5;

        for(int i =1; i<=n; i++)// rows
        {
          for(int j=1; j<=i; j++)
          {
              System.out.print("*");
          }
            System.out.println("");
        }
    }
}
