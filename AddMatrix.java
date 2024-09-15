import java.util.Scanner;
public class AddMatrix { 
    public static void main(String[] args){
        int m,i,j;
        Scanner in= new Scanner(System.in);
    System.out.println("Enter the matrix order:");
m=in.nextInt();
int m1[][]=new int[m][m];
int m2[][]=new int[m][m];
int res[][]=new int[m][m];

System.out.println("Enter elements of matrix1:");
for(i=0;i<m;i++)
{
    for(j=0;j<m;j++)
    m1[i][j]=in.nextInt();
}
System.out.println("Enter elements of matrix2:");
for(i=0;i<m;i++)
{
    for(j=0;j<m;j++)
    m2[i][j]=in.nextInt();

}
for(i=0;i<m;i++)
for(j=0;j<m;j++)
res[i][j]=m1[i][j]+m2[i][j];

System.out.println("Sum of matrices:");
for(i=0;i<m;i++)
{
    for(j=0;j<m;j++)
    System.out.print(res[i][j]+"\t");
    System.out.println();
}
}

    
}
