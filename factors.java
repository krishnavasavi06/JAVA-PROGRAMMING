public class factors{
public static void main(String args[]){
int num=10;
int c=0;
for (int i=1;i<=num;i++)
{
if(num%i==0){
c=c+1;
int arr[ ]=i;
System.out.print("no of factors:",c);
}
}
System.out.println("Factors of"+num+"=",arr[i]);
int b=3;
System.out.println(+b+ "th factor of"+num+ "is",arr[2]);
}
}

