
import java.util.Scanner;

public class compo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		for(int i=a+1;i<=b;i++)
		{
		 int c=0;
		 for(int j=1;j<=b;j++)
		 {
		 if(i%j==0)
		 c++;
		 }
		 if(c>2)
		 System.out.print(i+" ");
		}
	}

}