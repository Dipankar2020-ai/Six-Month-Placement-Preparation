# Link->https://nados.io/question/gcd-and-lcm

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
       
    Scanner sc =new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int temp1=n1;
    int temp2=n2;
    while(temp1%temp2!=0)
    {
      int rem=temp1%temp2;
      temp1=temp2;
      temp2=rem;
    }
    System.out.println(temp2);
    int lcm=(n1*n2)/temp2;
    System.out.println(lcm);


     }
    }
