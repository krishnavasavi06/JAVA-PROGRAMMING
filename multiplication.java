public class multiplication{
 public static void main(String args[]) {
int arr1[][] = { {1, 2}, {3, 2} };
 int arr2[][] = { {2, 3}, {4, 6} };

int res[][] = new int[arr1.length][arr2[0].length];

 for (int i = 0; i < arr1.length; i++) {
for (int j = 0; j < arr2[0].length; j++) {
for (int k = 0; k < arr1[0].length; k++) {
res[i][j] += arr1[i][k] * arr2[k][j];
  }
 }
}

System.out.println("Matrix multiplication result:");
for (int i = 0; i < res.length; i++) {
for (int j = 0; j < res[0].length; j++) {
System.out.print(res[i][j] + " ");
}
System.out.println();
}
 }
}
