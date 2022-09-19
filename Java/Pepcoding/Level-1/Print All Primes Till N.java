//Link->https://nados.io/question/print-all-primes-till-n

import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        int i=0,j=0;
        for(i=low;i<=high;i++)
        {
            boolean flag=true;
            for( j=2;j*j<=i;j++)
            {
                 if(i%j==0)
                 {
                     flag=false;
                     break;
                 }
            }
            if(flag==true)
            {
                System.out.println(i);
            }
        }
    }
}
