import java.util.Scanner;
public class FactorialRecursion{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num= sc.nextInt();
long fact=mul(num);
System.out.println("Factorial of"+ num + "is:"+fact);
}
public static long mul(int num){
if(num>=1)
return num*mul(num-1); 
else
return 1;
}
}

