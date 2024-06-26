public class Primecom{
public static void main(String[] args){
int arr[]={4,5,16,24,17,10};
int com=0,pri=0;
for(int i=0;i<arr.length;i++){
int c=0;
for(int j=1;j<arr[i];j++){
if(arr[i]%j==0)
c++;
}
if(c>1)
com++;
else
pri++;
}
System.out.print("composite numbers:"+com);
System.out.print("\nprime numbers:"+pri);
}
}