import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args)
    {
        int Num;
        Scanner S = new Scanner(System.in);
        Num = S.nextInt();
        int arr[] = new int[Num];
        for(int i = 0; i < Num; i++)
        {
            arr[i] = S.nextInt();
        }
        int Odd =0, Even = 0;
        for(int i = 0; i < Num; i++)
        {
            if(arr[i] % 2 == 1)
                Odd++;
            else
                Even++;
        }
        if(Odd == Num)
            System.out.print("Odd");
        else if(Even == Num)
            System.out.print("Even");
        else
            System.out.print("Mixed");

    }
}
