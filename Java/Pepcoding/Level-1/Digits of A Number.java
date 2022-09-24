//Link-https://nados.io/question/digits-of-a-number
import java.util.*;
    
    public class Main{

      public static void printdigit(int n)
      {
            int rem;
            if(n==0)
            {
              return;
            }
            rem=n%10;
            printdigit(n/10);
            System.out.println(rem);
      }
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      printdigit(n);
    
      

     }
    }
