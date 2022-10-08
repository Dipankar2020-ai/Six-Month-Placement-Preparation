//Link-> https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-11-official/ojquestion#
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
         
         int val=1;
         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print(val+"\t");
                 val=val+1;
             }
             System.out.println();
         }

    }
}
