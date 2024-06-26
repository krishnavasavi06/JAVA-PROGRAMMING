class fibonacci{
public static void main(String args[]){
int n=10,a=0,b=1;
System.out.println("Fibonacci series till" +n+  "terms:");
for(int i=0;i<=n;i++){
System.out.println(a+ " "+b);
int next=a+b;
a=b;
b=next;
}
}
}

