import java.util.*;
import java.io.*;
class Sumofdigits 
{
  public static void main(String args[])
  {
        int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
	int dig;
	int total=0;
        while(a>0)
	{
    		dig=a%10;
    		total=total+dig;
   		a=a/10;
	}
	System.out.println(total);
  }
}
