//Link->https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-12-official/ojquestion
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        int c=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+"\t");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }

        // write ur code here

    }
}
