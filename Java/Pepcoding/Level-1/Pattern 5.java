#Link->https://nados.io/question/pattern-5

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int m1=(n/2)+1;
        int m2=n-m1;

        for(int i=1;i<=m1;i++)
        {
            for(int j=m1;j>i;j--)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

        for(int i=m2;i>=1;i--)
        {
            for(int j=i;j<=m2;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*\t");
                
            }
              System.out.println();
        }


    }
}
