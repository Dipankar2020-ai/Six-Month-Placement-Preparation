# Link->https://nados.io/question/pythagorean-triplet
import java.util.*;
  
  public class Main {
  
  	  public static void main(String[] args) {
  	  	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=a;
		if(b>max)
		{
			max=b;
		}
		if(c>max)
		{
			max=c;
		}
        
		if(max==a)
		{
			if((a*a)==(b*b)+(c*c))
			{
				System.out.print("true");
			}
			else{
				System.out.print("false");
			}
		}
		else if(max==b)
		{
			if((b*b)==(a*a)+(c*c))
			{
				System.out.print("true");
			}
			else{
				System.out.print("false");
			}
		}
		else 
		{
			if((c*c)==(a*a)+(b*b))
			{
				System.out.print("true");
			}
			else{
				System.out.print("false");
			}
		}


  	  }
  }
