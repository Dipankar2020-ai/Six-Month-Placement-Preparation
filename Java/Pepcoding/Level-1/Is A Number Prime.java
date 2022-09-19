//Link-https://nados.io/question/is-a-number-prime


import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  
      int t=sc.nextInt();
      while(t>0)
      {
        int n=sc.nextInt();
        boolean flag=true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
              flag=false;
              break;
            }
        }
        if(flag==true)
      {
        System.out.println("prime");
      }
      else
      {
         System.out.println("not prime");
      }
      t=t-1;
      }
      




  
   }
  }
