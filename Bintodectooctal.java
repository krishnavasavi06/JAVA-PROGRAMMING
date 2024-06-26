import java.util.Scanner;
public class Bintodectooctal{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the binary num:");
String bin=input.nextLine();
int dec=Integer.parseInt(bin,2);
System.out.println("Decimal: "+dec);
String oct=Integer.toOctalString(dec);
System.out.println("Octal: "+oct);
}
}
