public class R192210271{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int arr[]=new int[100];
int j=1;
for(int i=1;i<100;i++)
{
if(i%2!=0)
{
arr[j]=1;
j++;
}
}
System.out.print(arr[n*2]);
}
}