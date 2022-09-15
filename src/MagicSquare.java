import java.util.Scanner;
public class MagicSquare {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr [][]= new int [row][col];
        System.out.println("Enter the elements of array");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        int rowsum []=new int [row];
        int colsum []=new int[col];
        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<col;j++)
            {
                sum=sum+arr[i][j];
                rowsum[i]=sum;
            }
        }
        for(int i=0;i<rowsum.length;i++)
        {
            System.out.println(rowsum[i]);
        }
        int sumofallrow=0;
        for(int i=0;i<rowsum.length;i++)
        {
            sumofallrow=sumofallrow+rowsum[i];
        }
        System.out.println(sumofallrow);
        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<col;j++)
            {
                sum=sum+arr[j][i];
                colsum[i]=sum;
            }
        }
        for(int i=0;i<colsum.length;i++)
        {
            System.out.println(colsum[i]);
        }
        int sumofallcol=0;
        for(int i=0;i<colsum.length;i++)
        {
            sumofallcol= sumofallcol+colsum[i];
        }
        System.out.println(sumofallcol);
        int sumoffordngl=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j)
                {
                    sumoffordngl=sumoffordngl+arr[i][j];
                }
            }
        }
        System.out.println(sumoffordngl);
        int sumofbackdngl=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i+j==col-1)
                {
                    sumofbackdngl=sumofbackdngl+arr[i][j];
                }
            }
        }
        System.out.println(sumofbackdngl);
        int a=sumofallcol/col;
        int b=sumofallrow/row;
        if(sumofbackdngl==b && sumofbackdngl==a && sumofbackdngl==sumoffordngl)
        {
            System.out.println("Is a magic square");
        }
        else
        {
            System.out.println("Is not a magic square");
        }

    }
}

