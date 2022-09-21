
//Link-https://nados.io/question/print-fibonacci-numbers-till-n

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0,b=1,c;
      for(int i=1;i<=n;i++)
      {
        System.out.println(a);
        c=a+b;
        a=b;
        b=c;

      }
   }
  }
