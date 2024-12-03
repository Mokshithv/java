import java.util.Scanner; 
public class Add 
{ 
public static void main(String[] args) 
{ 
if (args.length != 2)  
{ 
System.out.println("Usage: java MatrixAddition <order_M_N>"); 
return; 
} 
int m, n; //Declare matrix size 
Scanner scan = new Scanner(System.in);  
m = Integer.parseInt(args[0]);//Initialize first matrix size 
n = Integer.parseInt(args[1]); //Initialize second matrix size 
int a[][] = new int[m][n]; //Declare first matrix 
int b[][] = new int[m][n]; //Declare second matrix 
int c[][] = new int[m][n]; //Declare third matrix 
//Initialize the first matrix 
System.out.println("Enter all the elements of first matrix:"); 
for (int i = 0; i < m; i++) 
{ 
for (int j = 0; j < n; j++) 
{ 
a[i][j] = scan.nextInt(); 
} 
} 
System.out.println(""); 
//Initialize the second matrix 
System.out.println("Enter all the elements of second matrix:"); 
for (int i = 0; i < m; i++) 
{ 
for (int j = 0; j < n; j++) 
{ 
b[i][j] = scan.nextInt(); 
} 
}
for (int i = 0; i < m; i++) 
{ 
for (int j = 0; j < n; j++) 
{ 
 
c[i][j] = a[i][j] + b[i][j]; 
 
} 
} 
//Print the resultant matrix 
System.out.println("Matrix after addition:"); 
for (int i = 0; i < m; i++) 
{ 
for (int j = 0; j < n; j++) 
{ 
System.out.print(c[i][j]+" "); 
} 
System.out.println(""); 
} 
} 
} 
